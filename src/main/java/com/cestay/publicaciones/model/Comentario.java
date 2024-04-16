package com.cestay.publicaciones.model;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "autor")
    private String autor;

    public String getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor;
    }

    public Long getId() {
        return id;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
