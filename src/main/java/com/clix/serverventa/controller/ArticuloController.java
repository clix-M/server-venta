package com.clix.serverventa.controller;

import com.clix.serverventa.model.Articulo;
import com.clix.serverventa.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {
    @Autowired
    private ArticuloService articuloService;

    @GetMapping
    public ResponseEntity<List<Articulo>> getAllArticulos() {
        return ResponseEntity.ok(articuloService.getAllArticulos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Articulo> getArticuloById(int id) {
        return ResponseEntity.ok(articuloService.getArticuloById(id));
    }

    @PostMapping
    public ResponseEntity<Articulo> addArticulo(Articulo articulo) {
        return ResponseEntity.ok(articuloService.addArticulo(articulo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Articulo> updateArticulo(Articulo articulo) {
        return ResponseEntity.ok(articuloService.updateArticulo(articulo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteArticulo(int id) {
        return ResponseEntity.ok(articuloService.deleteArticulo(id));
    }



}
