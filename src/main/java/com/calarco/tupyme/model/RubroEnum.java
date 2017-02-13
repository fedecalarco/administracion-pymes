package com.calarco.tupyme.model;

public enum RubroEnum {

    SERVICIO("Servicio"),
    INDUSTRIA("Industria"),
    COMERCIALES("Comerciales");

    private String nombre;

    RubroEnum(String nombreRubro){
        this.nombre = nombreRubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
