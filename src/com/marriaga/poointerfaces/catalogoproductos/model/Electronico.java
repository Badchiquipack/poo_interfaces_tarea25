package com.marriaga.poointerfaces.catalogoproductos.model;

abstract public class Electronico extends Producto implements IElectronico {

    protected String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }
}
