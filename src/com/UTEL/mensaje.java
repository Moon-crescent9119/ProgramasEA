package com.UTEL;

import java.util.Scanner;

public class mensaje {
    public String solicitaDatos(String mensaje) {
        System.out.println(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(String nombre) {
        //la cadena con formato %s reemplaza lo que tiene la variable nombre
        System.out.printf("Hola %s, bienvenido a Java", nombre);
    }
}



