package com.clix.serverventa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Ingreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngreso;
    // fk idProveedor
    private String tipoComprobante;
    private String serieComprobante;
    private String numComprobante;
    private Date fechaHora;
    private double impuesto;
    private double estado;

}
