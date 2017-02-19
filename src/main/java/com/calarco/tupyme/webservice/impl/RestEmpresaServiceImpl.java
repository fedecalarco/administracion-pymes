package com.calarco.tupyme.webservice.impl;

import com.calarco.tupyme.model.Empresa;
import com.calarco.tupyme.webservice.EmpleadoREST;
import com.calarco.tupyme.webservice.RestEmpresaService;
import lombok.Data;

import javax.ws.rs.core.Response;

@Data
public class RestEmpresaServiceImpl implements RestEmpresaService{

    public Response getEmpresas() {
        Empresa empresa1 = EmpleadoREST.createEmpresa();
        return Response.ok(empresa1).build();
    }
}
