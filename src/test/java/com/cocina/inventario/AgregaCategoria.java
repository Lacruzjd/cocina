package com.cocina.inventario;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cocina.viewmodels.inventario.CategoriaAdminImpl;

public class AgregaCategoria {

    private CategoriaAdminImpl categoria = new CategoriaAdminImpl();

   @Test
   @Before
    public void DefinirCategoria() {
        assertEquals("Cereales", categoria.definirCategoria("Cereales"));
    }   
    @Test
    public void validarCategoria(){
        assertEquals(true, categoria.formatoValido());
        assertEquals(true, categoria.categoriaExiste());
    }

    @Test
    public void guardarCategoria() {
        assertEquals("Guardado", categoria.agregarCategoria());
        
    }
}