package com.UTEL;

public class programaEA {
    public static void main(String[] args) {
        mensaje msj= new mensaje();
        String nombre = msj.solicitaDatos("Escribe tu nombre: ");
        String apellidos = msj.solicitaDatos("Escribe tu apellido: ");
        Persona p1= new Persona(nombre, apellidos);
        msj.saludar(p1);
    }

}



