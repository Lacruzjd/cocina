package com.cocina.inventario;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.cocina.models.inventario.metadata.Categoria;
import com.cocina.viewmodels.IngresoProductoImpl;


public class IngresoProducto {

    private IngresoProductoImpl ingresoProductoImpl = new IngresoProductoImpl();

    @Test
    public void agregarNuevoProducto() {
        assertEquals(new Categoria(), ingresoProductoImpl.seleccionarCategoria());

    }

    
}
