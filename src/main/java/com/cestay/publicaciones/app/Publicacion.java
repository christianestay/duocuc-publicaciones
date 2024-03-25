package com.cestay.publicaciones.app;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {

    private Long id;
    private String titulo;
    private String contenido;
    private String autor;
    private double promedioCalificaciones;

    private List<Calificacion> calificaciones = new ArrayList<>();
    private List<Comentario> comentarios = new ArrayList<>();

    public Publicacion(Long id, String titulo, String contenido, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.comentarios = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    public Long getId() {
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
        calculateAverage();
    }

    private void calculateAverage() {
        double sum = 0;
        for (Calificacion calificacion : calificaciones) {
            sum += calificacion.getCalificacion();
        }
        double average = sum / calificaciones.size();
        this.promedioCalificaciones = average;
    }

    public double getPromedioCalificaciones() {
        return promedioCalificaciones;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
}
