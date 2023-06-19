package com.clix.serverventa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleVenta;
    // fk idVenta
    // fk idArticulo
    private int cantidad;
    private double precioVenta;
    private double descuento;

}
