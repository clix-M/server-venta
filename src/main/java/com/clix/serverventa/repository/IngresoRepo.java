package com.clix.serverventa.repository;

import com.clix.serverventa.model.Ingreso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngresoRepo extends JpaRepository<Ingreso, Integer> {
}
