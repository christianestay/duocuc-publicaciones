package com.cestay.publicaciones.model;

public class Comentario {

    private String contenido;
    private String autor;

    public Comentario(String contenido, String autor) {
        this.contenido = contenido;
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor;
    }
}
