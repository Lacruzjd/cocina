package com.cocina.services;

import java.sql.Connection;

public interface ConexionBaseDatos {

    public void loadDriver();
    public Connection databaseConecction();

}
