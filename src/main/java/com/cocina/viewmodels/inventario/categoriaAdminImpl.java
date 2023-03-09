package com.cocina.viewmodels.inventario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cocina.models.inventario.Categoria;
import com.cocina.services.inventario.InventarioDaoImplSQLite;

public class CategoriaAdminImpl {

    private String name;
    InventarioDaoImplSQLite coneccion = new InventarioDaoImplSQLite();

    public String definirCategoria(String name) {
        this.name = name;
        return this.name;
    }

    public boolean formatoValido() {
        Pattern pat = Pattern.compile("^[a-zA-Z]*$");
        Matcher mat = pat.matcher(this.name);
        if(mat.matches()){
            return true;
        }
        return false;
    }
    
    public boolean categoriaExiste() {
        if (coneccion.consultarExistencia(this.name)) {
            return true;
        }
        return false;
    }

    public String agregarCategoria() {
        if(formatoValido() && !categoriaExiste()){
            Categoria categoria = new Categoria();
            categoria.setNombre(name);
            coneccion.guardar(categoria);
        }
        return "Guardado";
    }
}
