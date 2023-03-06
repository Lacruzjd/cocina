package com.cocina.models.inventario.metadata;

import java.util.Date;

public class DatosProcuto {
    private String nombreProducto;
    private Integer contenidoNeto;
    private Integer lote; 
    private Date fechaCaducidad;
    private String listaIngredientes;
    private Fabricante fabricante;
    private String condicionConservacion;
    //Pais paisOrigen;
    
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Integer getContenidoNeto() {
        return contenidoNeto;
    }
    public void setContenidoNeto(Integer contenidoNeto) {
        this.contenidoNeto = contenidoNeto;
    }
    public Integer getLote() {
        return lote;
    }
    public void setLote(Integer lote) {
        this.lote = lote;
    }
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public String getListaIngredientes() {
        return listaIngredientes;
    }
    public void setListaIngredientes(String listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    public String getCondicionConservacion() {
        return condicionConservacion;
    }
    public void setCondicionConservacion(String condicionConservacion) {
        this.condicionConservacion = condicionConservacion;
    }
    
    @Override
    public String toString() {
        return "Etiquetado [nombreProducto=" + nombreProducto + ", contenidoNeto=" + contenidoNeto + ", lote=" + lote
                + ", fechaCaducidad=" + fechaCaducidad + ", listaIngredientes=" + listaIngredientes + ", fabricante="
                + fabricante + ", condicionConservacion=" + condicionConservacion + "]";
    }

    
    
}
