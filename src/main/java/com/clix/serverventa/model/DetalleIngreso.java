package com.clix.serverventa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DetalleIngreso {
    @Id
    private int idDetalleIngreso;
    // fk idIngreso
    // fk idArticulo
    private int cantidad;
    private double precioCompra;
    private double precioVenta;
}
