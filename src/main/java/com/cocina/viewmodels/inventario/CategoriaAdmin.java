package com.cocina.viewmodels.inventario;

import jakarta.persistence.SqlResultSetMapping;

public interface CategoriaAdmin {
    
    public String definirCategoria(String name);
    public boolean validarCategoria();
    public void agregarCategoria();
}
