package com.clix.serverventa.repository;

import com.clix.serverventa.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentaRepo extends JpaRepository<DetalleVenta, Integer> {
}
