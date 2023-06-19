package com.clix.serverventa.repository;

import com.clix.serverventa.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepo extends JpaRepository<Categoria, Integer> {
}
