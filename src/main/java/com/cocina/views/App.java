package com.cocina.views;

import com.cocina.viewmodels.inventario.CategoriaAdmin;
import com.cocina.viewmodels.inventario.categoriaAdminImpl;

public class App {
    
    public static void main( String[] args ){
        
        categoriaAdminImpl categoriaAdmin = new categoriaAdminImpl();
        
        categoriaAdmin.definirCategoria("Cereales");


    }   
       
}
