package com.calarco.tupyme.model;

public class Direccion {

    private String id;
    private String calle;
    private int altura;
    private String pais;
    private String provincia;
    private String ciudad;
    private int codigoPostal;

    public Direccion() {
    }

    public Direccion(String id, String calle, int altura, String pais, String provincia, String ciudad, int codigoPostal) {
        this.id = id;
        this.calle = calle;
        this.altura = altura;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
