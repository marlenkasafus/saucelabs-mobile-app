package com.marlen.models;

public class InformacionPersonal {
    private String nombre;
    private String apellido;
    private String codigoPostal;

    public InformacionPersonal(String nombre, String apellido, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }
}
