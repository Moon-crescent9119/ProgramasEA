package com.UTEL;

public class programaEA {
    public static void main(String[] args) {
        mensaje msj= new mensaje();
        String nombre = msj.solicitaDatos("Escribe tu nombre: ");
        msj.saludar(nombre );
    }
}



