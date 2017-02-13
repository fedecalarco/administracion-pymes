package com.calarco.tupyme.model;

import java.util.List;
import java.util.Map;

public class Empresa {

    private String id;
    private String nombre;
    private String cuit;
    private RubroEnum rubro;
    private String descripcion;
    private Map<TipoDireccionEnum,Direccion> direcciones;
    private TipoSocialEnum tipoSocial;
    private List<Empleado> empleados;

    public Empresa() {
    }

    public Empresa(String id, String nombre, String cuit, RubroEnum rubro, String descripcion,
                   Map<TipoDireccionEnum, Direccion> direcciones, TipoSocialEnum tipoSocial) {
        this.id = id;
        this.nombre = nombre;
        this.cuit = cuit;
        this.rubro = rubro;
        this.descripcion = descripcion;
        this.direcciones = direcciones;
        this.tipoSocial = tipoSocial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public RubroEnum getRubro() {
        return rubro;
    }

    public void setRubro(RubroEnum rubro) {
        this.rubro = rubro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Map<TipoDireccionEnum, Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Map<TipoDireccionEnum, Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public TipoSocialEnum getTipoSocial() {
        return tipoSocial;
    }

    public void setTipoSocial(TipoSocialEnum tipoSocial) {
        this.tipoSocial = tipoSocial;
    }
}

