package com.cestay.publicaciones.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicacionController {

    private List<Publicacion> publicaciones;

    public PublicacionController() {
        this.publicaciones = new ArrayList<>();
        
        Publicacion publicacion1 = new Publicacion(1L, "Publicación 1", "Contenido de la publicación 1", "Autor 1");
        publicacion1.setComentario(new Comentario("Comentario 1", "Autor 2"));
        publicacion1.setComentario(new Comentario("Comentario 2", "Autor 3"));
        publicacion1.setCalificacion(new Calificacion(5, "autor 4"));
        publicacion1.setCalificacion(new Calificacion(4, "autor 5"));
        publicacion1.setCalificacion(new Calificacion(8, "autor 6"));
        publicaciones.add(publicacion1);

        Publicacion publicacion2 = new Publicacion(2L, "Publicación 2", "Contenido de la publicación 2", "Autor 2");
        publicacion2.setComentario(new Comentario("Comentario 3", "Autor 1"));
        publicacion2.setComentario(new Comentario("Comentario 4", "Autor 3"));
        publicacion2.setCalificacion(new Calificacion(7, "autor 4"));
        publicacion2.setCalificacion(new Calificacion(6, "autor 5"));
        publicacion2.setCalificacion(new Calificacion(9, "autor 6"));
        publicaciones.add(publicacion2);

        Publicacion publicacion3 = new Publicacion(3L, "Publicación 3", "Contenido de la publicación 3", "Autor 3");
        publicacion3.setComentario(new Comentario("Comentario 5", "Autor 1"));
        publicacion3.setComentario(new Comentario("Comentario 6", "Autor 2"));
        publicacion3.setCalificacion(new Calificacion(3, "autor 4"));
        publicacion3.setCalificacion(new Calificacion(2, "autor 5"));
        publicacion3.setCalificacion(new Calificacion(1, "autor 6"));
        publicaciones.add(publicacion3);
        
    }
    
    @GetMapping("/publicaciones")
    public List<Publicacion> getPublicacions() {
        return publicaciones;
    }

    @GetMapping("/publicaciones/{id}")
    public Publicacion getPublicacion(@PathVariable Long id) {
        return publicaciones.stream().filter(pub -> pub.getId().equals(id)).findFirst().orElse(null);
    }


}
