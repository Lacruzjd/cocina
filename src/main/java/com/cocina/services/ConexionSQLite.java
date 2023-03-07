package com.cocina.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLite implements ConexionBaseDatos {

    @Override
    public void loadDriver() {

        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("The driver was successfully loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("The driver class was not found in the program files at runtime.");
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public Connection databaseConecction() {

        Connection connection;
        String url = "jdbc:sqlite:resources/cocina.db";

        try {
            connection = DriverManager.getConnection(url);
            System.out.println("The connection to the SQLite database was successful!");
            return connection;
        } catch (SQLException e) {
            System.out.println("The connection to the database was unsuccessful!");
            System.out.println(e);
        }
        return null;
    }

}
