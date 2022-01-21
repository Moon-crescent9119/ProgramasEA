package com.UTEL;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        System.out.println("Está instrucción es inservible");
        return "%s %s" .formatted(nombre, apellidos);

    }
}
