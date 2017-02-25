package com.calarco.tupyme.webservice;

import com.calarco.tupyme.model.Direccion;
import com.calarco.tupyme.model.Empleado;
import com.calarco.tupyme.model.Empresa;
import com.calarco.tupyme.model.RubroEnum;
import com.calarco.tupyme.model.TipoDireccionEnum;
import com.calarco.tupyme.model.TipoSocialEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpleadoREST {

    public static Empresa createEmpresa(){
        Empresa emp = new Empresa();

        emp.setId("1");
        emp.setNombre("Cerveceria Calarco");
        emp.setCuit("20-1234567-8");
        emp.setRubro(RubroEnum.INDUSTRIA);
        emp.setTipoSocial(TipoSocialEnum.SOCIEDAD_COOPERATIVA);
        emp.setEmpleados(createEmpleados());
        emp.setDirecciones(createDireccionesEmpresa());

        return emp;
    }



    public static List<Empleado> createEmpleados(){
        List<Empleado> empleados = new ArrayList<Empleado>();

        Empleado emp1 = new Empleado();
        emp1.setNombre("Federico Gaston Calarco");
        emp1.setCuit("20-38232274-7");
        emp1.setCantidadHijos(12);
        emp1.setCasado(true);
        emp1.setEdad(22);
        emp1.setDireccion(createDireccion());

        empleados.add(emp1);

        return empleados;
    }

    public static Direccion createDireccion(){
        Direccion direccion = new Direccion();

        direccion.setId("1");
        direccion.setCalle("55");
        direccion.setAltura(648);
        direccion.setPiso(3);
        direccion.setDpto('A');
        direccion.setCiudad("La Plata");
        direccion.setProvincia("Buenos Aires");
        direccion.setPais("Argentina");
        direccion.setCodigoPostal(1900);

        return direccion;
    }

    public static Map<TipoDireccionEnum,Direccion> createDireccionesEmpresa(){
        Map<TipoDireccionEnum,Direccion> direcciones = new HashMap<TipoDireccionEnum,Direccion>();
        direcciones.put(TipoDireccionEnum.DIRECCION_FISICA,createDireccion());
        return direcciones;
    }


    public static void main(String... args){

        Empresa empresa1 = createEmpresa();

        System.out.println(empresa1.toString());


    }


}
