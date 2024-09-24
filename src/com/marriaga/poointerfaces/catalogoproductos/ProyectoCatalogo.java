package com.marriaga.poointerfaces.catalogoproductos;

import com.marriaga.poointerfaces.catalogoproductos.model.*;

import java.util.Calendar;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        Calendar fecha = Calendar.getInstance();
        fecha.set(1996, 11, 12);

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1998, 9, 1);

        IProducto[] productos = new IProducto[4];

        IProducto iphone = new IPhone(31000, "Apple", "Black Space", "16 pro max");
        IProducto smartTv = new TvLcd(11999, "Samsung", 70);
        IProducto libro = new Libro(375, fecha.getTime(),
                "Juan Camaney", "El otro lado del arbol", "Trillas");

        IProducto comic = new Comic(159, fecha2.getTime(), "Rob Curtis", "Catwoman", "DC",
                "Catwoman");

        productos[0] = iphone;
        productos[1] = smartTv;
        productos[2] = libro;
        productos[3] = comic;

        for (IProducto producto : productos) {
            System.out.println("=========" + producto.getClass().getSimpleName() + "=========");
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Precio de venta: " + producto.getPrecioVenta());
            if (producto instanceof Electronico) {
                System.out.println("Fabricante: " + ((Electronico) producto).getFabricante());
                if (producto instanceof IPhone) {
                    System.out.println("Color: " + ((IPhone) producto).getColor());
                    System.out.println("Modelo: " + ((IPhone) producto).getModelo());
                }
                if (producto instanceof TvLcd) {
                    System.out.println("Pulgadas: " + ((TvLcd) producto).getPulgadas());
                }
            }
            if (producto instanceof Libro) {
                System.out.println("Fecha de publicación: " + ((Libro) producto).getFechaPublicacion());
                System.out.println("Autor: " + ((Libro) producto).getAutor());
                System.out.println("Título: " + ((Libro) producto).getTitulo());
                System.out.println("Editorial: " + ((Libro) producto).getEditorial());
                if (producto instanceof Comic) {
                    System.out.println("Personaje: " + ((Comic) producto).getPersonaje());
                }
            }
        }
    }
}
