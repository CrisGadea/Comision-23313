package com.example.comision23313.clases;

import java.util.Date;

public class Persona {
    // Caracteristas de la clase Persona
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;

    // private Date fechaNacimiento;

    // Comportamientos - Métodos

    // Metodo Constructor

    public Persona(){} // Constructor por defecto

    public Persona(String nombre, String apellido, int edad, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " " + apellido);
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
