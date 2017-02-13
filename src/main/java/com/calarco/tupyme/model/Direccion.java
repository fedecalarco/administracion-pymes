package com.calarco.tupyme.model;

import lombok.Data;

@Data
public class Direccion {

    private String id;
    private String calle;
    private int altura;
    private int piso;
    private char dpto;
    private String pais;
    private String provincia;
    private String ciudad;
    private int codigoPostal;
}
