package com.cestay.publicaciones.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "Calificaciones")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "nota")
    private int nota;

    @Column(name = "autor")
    private String autor;

    public void setId(Long id) {
        this.Id = id;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNota() {
        return nota;
    }

    public String getAutor() {
        return autor;
    }

    public Long getId() {
        return Id;
    }   

}
