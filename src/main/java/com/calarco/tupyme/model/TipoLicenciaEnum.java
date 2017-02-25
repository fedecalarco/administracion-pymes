package com.calarco.tupyme.model;

/**
 * Created by nicof on 21/02/2017.
 */
public enum TipoLicenciaEnum {

    LICENCIA_VACACIONES("Licencia de vacaciones"),
    LICENCIA_ENFERMEDAD("Licencia de enfermedad"),
    LICENCIA_ESTUDIO("Licencia de estudio"),
    LICENCIA_CAPACITACION("Licencia de capacitacion"),
    LICENCIA_CASAMIENTO("Licencia de casamiento"),
    LICENCIA_MATERNIDAD("Licencia de maternidad"),
    LICENCIA_FALLECIMIENTO("Licencia de fallecimiento"),
    LICENCIA_PATERNIDAD("Licencia de paternidad"),
    LICENCIA_HIJO("Licencia por hijo"),
    LICENCIA_INJUSTIFICADA("Licencia injustificada");

    private String tipoLicencia;

    TipoLicenciaEnum(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
}

