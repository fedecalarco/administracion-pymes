package com.calarco.tupyme.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces( MediaType.APPLICATION_JSON)
public interface RestEmpresaService {

    @GET
    @Path("/empresas")
    Response getEmpresas();
}
