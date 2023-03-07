package com.cocina.viewmodels;

import com.cocina.models.inventario.metadata.Categoria;
import com.cocina.models.inventario.metadata.Producto;
import com.cocina.models.inventario.metadata.SubCategoria;

public class IngresoProductoImpl implements IngresoProducto {

    @Override

    public void agregarNuevoProducto() {
        seleccionarCategoria();

    }

    @Override
    public  Categoria seleccionarCategoria() {
        return null;
    }

    @Override
    public SubCategoria seleccionarSubcategoria() {
        return null;
    }

    @Override
    public Producto creaProducto() {
        return null;
    }

    @Override
    public void guardarProductocreado() {
       
    }
    
}
