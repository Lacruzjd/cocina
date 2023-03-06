package com.cocina.viewmodels;

import java.security.PublicKey;
import java.util.ArrayList;

import com.cocina.models.inventario.metadata.Categoria;
import com.cocina.models.inventario.metadata.IdNombre;
import com.cocina.services.InventarioDaoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static ArrayList<Categoria> categorias = new ArrayList<>();
    
    
    public static void main( String[] args ){
    
        App app = new App();
        
        app.addCategoriaLista(new Categoria("Lacteos"));
        app.addCategoriaLista(new Categoria("Cereales"));


        InventarioDaoService.loadDriverSQLite();
        InventarioDaoService.databaseConecction();
        InventarioDaoService.createTable();
        InventarioDaoService.insertValueTable(categorias);
        
    }

    public  void addCategoriaLista(Categoria categoria) {
        categorias.add(categoria);
    }
}
