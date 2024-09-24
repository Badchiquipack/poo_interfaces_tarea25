package com.marriaga.poointerfaces.catalogoproductos.model;

public class TvLcd extends Electronico implements IProducto {

    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.2;
    }
}
