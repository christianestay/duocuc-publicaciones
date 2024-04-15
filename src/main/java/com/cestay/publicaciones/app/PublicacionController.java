package com.cestay.publicaciones.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cestay.publicaciones.model.Calificacion;
import com.cestay.publicaciones.model.Comentario;
import com.cestay.publicaciones.model.Publicacion;
import com.cestay.publicaciones.service.PublicacionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/publicaciones")

public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

            
    @GetMapping("/publicaciones")
    public List<Publicacion> getPublicacions() {
        return publicacionService.getAllPublicaciones();
    }

    @GetMapping("/publicaciones/{id}")
    public Publicacion getPublicacion(@PathVariable Long id) {
        return publicacionService.getAllPublicaciones().stream().filter(pub -> pub.getId().equals(id)).findFirst().orElse(null);
    }

    @PostMapping("/publicaciones")
    public Publicacion postMethodName(Publicacion entity) {
        
        return publicacionService.savePublicacion(entity);  
    }

    @PutMapping("publicaciones")
    public Publicacion putMethodName(@RequestBody Publicacion entity) {
        return publicacionService.updatePublicacion(entity);
    }

    @DeleteMapping("/publicaciones/{id}")
    public void deletePublicacion(@PathVariable Long id) {
        publicacionService.deletePublicacionById(id);
    }
    

}
