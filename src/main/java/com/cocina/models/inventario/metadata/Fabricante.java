package com.cocina.models.inventario.metadata;

public class Fabricante extends IdNombre{

    public Fabricante(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Fabricante ["+getNombre()+"]";
    }

    
}
