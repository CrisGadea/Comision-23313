package com.example.comision23313.clases;

public class Gato extends Animal{

    public Gato(String nombre, String raza, int edad){
            super();
            this.nombre = nombre;
            this.raza = raza;
            this.edad = edad;
    }

    public String ronroneo(){
        return "roar";
    }

    @Override
    public String moverse(){
        return "El gato comienza a desplazarse";
    }

}
