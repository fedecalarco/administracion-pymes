package com.calarco.tupyme.model;

import java.util.Map;

public class Empresa {

    private String id;
    private String nombre;
    private String cuit;
    private RubroEnum rubro;
    private String descripcion;
    private Map<String,Direccion> direcciones;


}
