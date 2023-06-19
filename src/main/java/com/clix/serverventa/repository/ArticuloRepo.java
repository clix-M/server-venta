package com.clix.serverventa.repository;

import com.clix.serverventa.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepo extends JpaRepository<Articulo, Integer> {
}
