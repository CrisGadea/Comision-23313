package com.example.comision23313.clases;

public class Perro extends Animal{

    public Perro() {
        this.tipo = "Perro";
    }

    public Perro(String nombre, String raza, int edad, String color, String tipo) {
        super(nombre, raza, edad, color, tipo);
    }

    @Override
    public String moverse(){
        return "El perro comienza a correr";
    }

    // Un metodo (funcion) se divide en dos partes:
    // 1. Firma (Va desde el modificador de acceso hasta los parametros)
    // 2. Cuerpo (Es lo que esta entre { })

    // Sobrecarga del metodo moverse (tener 2 metodos con mismo nombre
    // pero diferente firma)
    public String moverse(int cantPatas){
        return "";
    }

}
