package com.cocina.models.inventario.metadata;

import java.util.Date;

public class DatosIngreso {
    Date fechaIngreso;

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "DatosIngreso [fechaIngreso=" + fechaIngreso + "]";
    }

}
