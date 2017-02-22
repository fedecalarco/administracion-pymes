package com.calarco.tupyme.model;

/**
 * Created by nicof on 21/02/2017.
 */

import lombok.Data;
@Data


public enum EstrucuraEmpresa {

    private String Gerente_Administrador;
    private String Sub_Gerente;
    private String Plataforma_Comerical;
    private String Plataforma_Operativa;
    private String Plataforma_Tesoreria;
    private String Jefes_Comercial;
    private String Jefes_operativos;
    private String Oficiales_Cuenta;
    private String Oficiales_Negocio;
    private String Vendedores;
    private String Auxiliares;
    private String Cajeros;
}
