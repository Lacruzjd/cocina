package com.cocina.services.inventario;

import java.sql.Connection;

import com.cocina.models.inventario.Categoria;

public interface CategoriaDao {
    
    public Connection conectarDB();
    public boolean consultarExistencia(String name);
    public void guardar(Categoria categoria);

}
