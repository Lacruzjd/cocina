package com.cocina.services.inventario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cocina.models.inventario.Categoria;
import com.cocina.services.ConexionSQLite;

public class InventarioDaoImplSQLite implements InventarioDao<Categoria>{

    @Override
    public Connection conectarDB() {
        ConexionSQLite conexionSQLite = new ConexionSQLite();
        return conexionSQLite.databaseConecction();
    }

    @Override
    public void crearTabla() {

        try {
            Statement statement = conectarDB().createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS caregoria(IdCategoria, nombre)"; 
            statement.executeUpdate(createTable);
            System.out.println("Tabla Categoria Creada");
            statement.close();
            conectarDB().close();
        } catch (SQLException e) {
            e.getStackTrace();
            System.out.println("Taba existe");

        }

    }

    @Override
    public boolean consultarExistencia(String name) {
        try{
            String sql = "SELECT nombre FROM categoria WHERE nombre = (\""+name+"\")";
            Statement statement = conectarDB().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if(resultSet.next()) {
                return true;
            }
            resultSet.close();
            statement.close();
            conectarDB().close();
        }catch(SQLException e){
            e.getStackTrace();
        }
        return false;
    }

    @Override
    public boolean guardar(Categoria categoria) {
        try{
            String sql = "INSERT INTO categoria(nombre) VALUES (\""+categoria.getNombre()+"\")";
            Statement statement = conectarDB().createStatement();
            statement.executeUpdate(sql);
            statement.close();
            conectarDB().close();
            return true;
        }catch(SQLException e){
            e.getStackTrace();
            return false;
        }
    }
    
}
