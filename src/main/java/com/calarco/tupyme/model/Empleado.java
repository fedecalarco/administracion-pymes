package com.calarco.tupyme.model;

import lombok.Data;

import java.util.List;

@Data
public class Empleado {

    private String nombre;
    private String apeliido;
    private String cuit;
    private Direccion direccion;
    private int cantidadHijos;
    private boolean casado;
    private String fechaNacimiento;
    private int edad;
    private String nLegajo;
    private String antiguedad;
    private String fechaIngreso;
    private String fechaEgreso;
    private List<EstrucuraEmpresa> puesto;



}