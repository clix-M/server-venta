package com.clix.serverventa.repository;

import com.clix.serverventa.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepo extends JpaRepository<Venta, Integer> {
}
