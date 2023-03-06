package com.cocina.models.inventario.metadata;

public class Categoria extends IdNombre{

      public Categoria(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Categoria ["+getNombre()+"]";
    }

    
}
