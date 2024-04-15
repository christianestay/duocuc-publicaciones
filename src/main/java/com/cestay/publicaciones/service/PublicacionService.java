package com.cestay.publicaciones.service;
import java.util.List;
import java.util.Optional;
import com.cestay.publicaciones.model.Publicacion;

public interface PublicacionService {
    List<Publicacion> getAllPublicaciones();
    Optional<Publicacion> getPublicacionById(Long id);
    Publicacion savePublicacion(Publicacion publicacion);
    void deletePublicacionById(Long id);
    Publicacion updatePublicacion(Publicacion publicacion);   
}
