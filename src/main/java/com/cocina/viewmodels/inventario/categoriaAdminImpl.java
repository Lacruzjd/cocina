package com.cocina.viewmodels.inventario;

import com.cocina.models.inventario.Categoria;
import com.cocina.services.inventario.CategoriaDaoImpl;

public class categoriaAdminImpl implements CategoriaAdmin {

    private String name;
    CategoriaDaoImpl coneccion = new CategoriaDaoImpl();

    @Override
    public void definirCategoria(String name) {
        this.name = name;
        validarCategoria();
    }

    @Override
    public void validarCategoria() {

        if (coneccion.consultarExistencia(name)) {
            System.out.println("Dato Existe en la DB");
        } else {
            agregarCategoria();
        }
    }

    @Override
    public void agregarCategoria() {

            Categoria categoria = new Categoria();
            categoria.setNombre(name);
            coneccion.guardar(categoria);
    }

}
