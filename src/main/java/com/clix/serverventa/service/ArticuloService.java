package com.clix.serverventa.service;

import com.clix.serverventa.model.Articulo;
import com.clix.serverventa.repository.ArticuloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloService {
    @Autowired
    private ArticuloRepo articuloRepo;

    public List<Articulo> getAllArticulos() {
        return articuloRepo.findAll();
    }

    public Articulo getArticuloById(int id) {
        return articuloRepo.findById(id).orElse(null);
    }

    public Articulo addArticulo(Articulo articulo) {
        return articuloRepo.save(articulo);
    }

    public Articulo updateArticulo(Articulo articulo) {
        Articulo existingArticulo = articuloRepo.findById(articulo.getIdArticulo()).orElse(null);
        assert existingArticulo != null;
        existingArticulo.setCodigo(articulo.getCodigo());
        existingArticulo.setNombre(articulo.getNombre());
        existingArticulo.setStock(articulo.getStock());
        existingArticulo.setDescripcion(articulo.getDescripcion());
        existingArticulo.setImagen(articulo.getImagen());
        existingArticulo.setEstado(articulo.isEstado());
        return articuloRepo.save(existingArticulo);
    }

    public String deleteArticulo(int id) {
        articuloRepo.deleteById(id);
        return "Articulo eliminado con id: " + id;
    }

}
