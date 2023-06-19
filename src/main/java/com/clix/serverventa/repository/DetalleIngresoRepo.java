package com.clix.serverventa.repository;

import com.clix.serverventa.model.DetalleIngreso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleIngresoRepo extends JpaRepository<DetalleIngreso, Integer> {
}
