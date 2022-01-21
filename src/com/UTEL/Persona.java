package com.UTEL;

public class Persona {
    private String nombre, apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
//método toString, para generar una cadena a partir de la clase persona

    @Override
    public String toString() {
        return "%s %s".formatted (nombre, apellidos);
    }

}
