package com.cocina.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cocina.models.inventario.metadata.Categoria;

public class InventarioDaoService {

    public static void loadDriverSQLite() {

        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("The driver was successfully loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("The driver class was not found in the program files at runtime.");
            e.printStackTrace();
            System.exit(1);
        }

    }

    private static final String url = "jdbc:sqlite:resources/cocina.db";

    public static void databaseConecction() {

        try (Connection connection = DriverManager.getConnection(url);
                Statement statement = connection.createStatement();) {
            System.out.println("The connection to the SQLite database was successful!");
        } catch (SQLException e) {
            System.out.println("The connection to the database was unsuccessful!");
            System.out.println(e);
        }
    }

    public static void createTable() {
        String categoriasTable = "CREATE TABLE categoria(IdCategoria INTEGER PRIMARY KEY, nombre TEX NOT NULL);";

        try (Connection connection = DriverManager.getConnection(url);
                Statement statement = connection.createStatement();) {
            statement.executeUpdate(categoriasTable);
            System.out.println("Categoria table has been created");
        } catch (SQLException e) {
            System.out.println("table not created!");
            System.out.println(e);
        }

    }

    public static void insertValueTable(ArrayList<Categoria> categorias) {
        
        try (Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();) {
        
            for (Categoria categoria : categorias) {
                String insertValueTable = "INSERT INTO categoria(nombre) VALUES (\""+categoria.getNombre()+"\")";
                statement.executeUpdate(insertValueTable);
                
            }
            System.out.println("Categoria value name has been created");
        } catch (SQLException e) {
            System.out.println("value not created!");
            System.out.println(e);
        }

    }

}
