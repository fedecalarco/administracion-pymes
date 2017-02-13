package com.calarco.tupyme.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Empresa {

    private String id;
    private String nombre;
    private String cuit;
    private RubroEnum rubro;
    private String descripcion;
    private Map<TipoDireccionEnum,Direccion> direcciones;
    private TipoSocialEnum tipoSocial;
    private List<Empleado> empleados;
}

