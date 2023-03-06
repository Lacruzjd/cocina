package com.cocina.models.inventario;

import com.cocina.models.inventario.metadata.DatosProcuto;

public class Producto extends DatosIngresoProducto {   
    private Integer id;
    private DatosProcuto etiquetado;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public DatosProcuto getEtiquetado() {
        return etiquetado;
    }
    public void setEtiquetado(DatosProcuto etiquetado) {
        this.etiquetado = etiquetado;
    }

}
