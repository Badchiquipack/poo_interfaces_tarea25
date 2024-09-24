package com.marriaga.poointerfaces.catalogoproductos.model;

import java.util.Date;

public interface ILibro {

    Date getFechaPublicacion();

    String getAutor();

    String getTitulo();

    String getEditorial();
}
