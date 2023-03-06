package com.cocina.models.inventario;

import com.cocina.models.inventario.metadata.Almacen;
import com.cocina.models.inventario.metadata.Categorias;
import com.cocina.models.inventario.metadata.Proveedor;

public class DatosIngresoProducto {
    private Categorias categorias;
    private Proveedor proveedor;
    private DatosIngresoProducto datosIngreso;
    private Almacen ubicacionAlmacen;

    public Categorias getCategorias() {
        return categorias;
    }
    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public DatosIngresoProducto getDatosIngreso() {
        return datosIngreso;
    }
    public void setDatosIngreso(DatosIngresoProducto datosIngreso) {
        this.datosIngreso = datosIngreso;
    }
    public Almacen getUbicacionAlmacen() {
        return ubicacionAlmacen;
    }
    public void setUbicacionAlmacen(Almacen ubicacionAlmacen) {
        this.ubicacionAlmacen = ubicacionAlmacen;
    }

    @Override
    public String toString() {
        return "Inventario [categorias=" + categorias + ", proveedor=" + proveedor + ", datosIngreso=" + datosIngreso
                + ", ubicacionAlmacen=" + ubicacionAlmacen + "]";
    }
 
}
