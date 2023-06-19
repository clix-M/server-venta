package com.clix.serverventa.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArticulo;
    // fk idCategoria
    private  int codigo;
    private String nombre;
    private String stock;
    private String descripcion;
    private String imagen;
    private boolean estado;
}
