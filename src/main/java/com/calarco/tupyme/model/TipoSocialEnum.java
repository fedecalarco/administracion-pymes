package com.calarco.tupyme.model;

public enum TipoSocialEnum {

    SOCIEDAD_DE_HECHO("Sociedad de hecho"),
    SOCIEDAD_SRL("Sociedad SRL"),
    SOCIEDAD_COOPERATIVA("Sociedad cooperativa"),
    SOCIEDAD_ANONIMA("Sociedad anonima"),
    FIDEICOMISO("Fideicomiso"),
    PERSONA_FISICA("Persona Fisica");



    private String tipoSocial;

    TipoSocialEnum(String tipoSocial){
        this.tipoSocial = tipoSocial;
    }

    public String getTipoSocial() {
        return tipoSocial;
    }

    public void setTipoSocial(String tipoSocial) {
        this.tipoSocial = tipoSocial;
    }
}
