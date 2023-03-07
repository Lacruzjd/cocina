package com.cocina.services.inventario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.cocina.models.inventario.Categoria;
import com.cocina.services.ConexionSQLite;

public class CategoriaDaoImpl implements CategoriaDao{

    @Override
    public Connection conectarDB() {
        ConexionSQLite conexionSQLite = new ConexionSQLite();
        return conexionSQLite.databaseConecction();
    }

    @Override
    public boolean consultarExistencia(String name) {
        return true;
    }

    @Override
    public void guardar(Categoria categoria) {
        try{
            String sql = "INSERT INTO categoria(nombre) VALUES (\""+categoria.getNombre()+"\")";
            Statement statement = conectarDB().createStatement();
            statement.executeUpdate(sql);
            statement.close();
            conectarDB().close();
        }catch(SQLException e){
            e.getStackTrace();
        }
        
    }
    
}
