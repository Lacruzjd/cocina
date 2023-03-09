package com.cocina.services.inventario;

import java.sql.Connection;

public interface InventarioDao<T> {
    
    public Connection conectarDB();
    public void crearTabla();
    public boolean consultarExistencia(String name);
    public boolean guardar(T obj);

}
