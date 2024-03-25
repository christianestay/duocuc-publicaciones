package com.cestay.publicaciones.app;

public class Calificacion {

    private int calificacion;
    private String autor;

    public Calificacion(int calificacion, String autor) {
        this.calificacion = calificacion;
        this.autor = autor;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getAutor() {
        return autor;
    }

}
