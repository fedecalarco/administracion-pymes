package com.calarco.tupyme.model;

import lombok.Data;

@Data
public class Empleado {

    private String nombreCompleto;
    private String cuit;
    private Direccion direccion;
    private int cantidadHijos;
    private boolean casado;
    private int edad;
}
