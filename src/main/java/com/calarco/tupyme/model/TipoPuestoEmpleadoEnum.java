package com.calarco.tupyme.model;

/**
 * Created by nicof on 21/02/2017.
 */

public enum TipoPuestoEmpleadoEnum {

    GERENTE_ADMINISTRADOR("Gerente administrador"),
    SUB_GERENTE("Sub Gerente"),
    PLATAFORMA_COMERCIAL("Plataforma comercial"),
    PLATAFORMA_OPERATIVA("Plataforma opertiva"),
    PLATAFORMA_TESORERIA("Plataforma tesoreria"),
    JEFE_COMERCIAL("Jefe comercial"),
    JEFE_OPERATIVOS("Jefe operativo"),
    OFICIAL_CUENTA("Oficial cuenta"),
    OFICIAL_NEGOCIO("Oficial negocio"),
    VENDEDOR("Vendedor"),
    AUXILIAR("Auxiliar"),
    CAJERO("Cajero");

    private String tipoPuesto;

    TipoPuestoEmpleadoEnum(String tipoPuesto){
        this.tipoPuesto = tipoPuesto;
    }

    public String getTipoPuesto() {
        return tipoPuesto;
    }

    public void setTipoPuesto(String tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }
}
