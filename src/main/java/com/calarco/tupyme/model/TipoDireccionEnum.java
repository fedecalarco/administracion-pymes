package com.calarco.tupyme.model;

public enum TipoDireccionEnum {

    DIRECCION_FISICA("Direccion fisica"),
    DIRECCION_REAL("Direccion real"),
    DIRECCION_SUCURSAL("Direccion sucursal");

    private String tipoDireccion;

    TipoDireccionEnum(String tipoDireccion){
        this.tipoDireccion = tipoDireccion;
    }

    public String getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(String tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }
}
