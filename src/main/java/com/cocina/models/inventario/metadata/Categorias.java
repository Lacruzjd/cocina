package com.cocina.models.inventario.metadata;

public class Categorias {
    private Categoria categoria;
    private SubCategoria subCategoria;

    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public SubCategoria getSubCategoria() {
        return subCategoria;
    }
    public void setSubCategoria(SubCategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    @Override
    public String toString() {
        return "Categorias [categoria=" + categoria + ", subCategoria=" + subCategoria + "]";
    }
   
}
