package com.cestay.publicaciones.app;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {

    private long id;
    private String titulo;
    private String contenido;
    private String autor;

    private List<Calificacion> calificaciones = new ArrayList<>();
    private List<Comentario> comentarios = new ArrayList<>();

    public Publicacion(long id, String titulo, String contenido, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.comentarios = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificaciones.add(calificacion);
    }

}
