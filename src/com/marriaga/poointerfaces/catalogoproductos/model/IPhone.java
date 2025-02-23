package com.marriaga.poointerfaces.catalogoproductos.model;

public class IPhone extends Electronico implements IProducto {

    private String color;
    private String modelo;

    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.1;
    }
}
