package com.cocina.viewmodels;

import java.util.List;

import com.cocina.models.inventario.metadata.Categoria;
import com.cocina.models.inventario.metadata.Producto;
import com.cocina.models.inventario.metadata.SubCategoria;

public interface IngresoProducto {

    public void agregarNuevoProducto();
    public Categoria seleccionarCategoria();
    public SubCategoria seleccionarSubcategoria();
    public Producto creaProducto();
    public void guardarProductocreado();
}
