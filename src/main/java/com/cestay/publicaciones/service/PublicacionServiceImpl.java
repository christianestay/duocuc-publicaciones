package com.cestay.publicaciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cestay.publicaciones.repository.PublicacionRepository;
import com.cestay.publicaciones.model.Publicacion;

import java.util.List;
import java.util.Optional;

@Service
public class PublicacionServiceImpl implements PublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    public List<Publicacion> getAllPublicaciones() {
        return publicacionRepository.findAll();
    }

    @Override
    public Optional<Publicacion> getPublicacionById(Long id) {
        return publicacionRepository.findById(id);
    }

    @Override
    public Publicacion savePublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }

    @Override
    public void deletePublicacionById(Long id) {
        publicacionRepository.deleteById(id);
    }

    @Override
    public Publicacion updatePublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }

}
