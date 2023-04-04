package org.example;

public class Persona {
    String nombre;
    int dni;


    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}
