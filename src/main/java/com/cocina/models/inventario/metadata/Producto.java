package com.cocina.models.inventario.metadata;

public class Producto{   
    private Integer id;
    private DatosProducto datosProducto;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public DatosProducto getEtiquetado() {
        return datosProducto;
    }
    
    public void setEtiquetado(DatosProducto etiquetado) {
        this.datosProducto = etiquetado;
    }

}
