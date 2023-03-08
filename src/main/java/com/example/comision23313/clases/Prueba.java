package com.example.comision23313.clases;

public class Prueba {
    public static void main(String[] args) {
        // Todas las clases en Java heredan de la Clase Object
        //System.out.println("Hola mundo");
        // Variables en Java
        int nota;
        String contenido;

        // Instanciar una clase
        Persona ruben = new Persona();
        // Construimos un objeto con valores iniciales
        Persona maria = new Persona("Maria", "Rosa", 23, 2345678);
        // Modificar la edad de Maria a traves del metodo setter
        maria.setEdad(24);

        System.out.println(maria.getNombre() + " tiene " + maria.getEdad() + " años");
        // Le damos los valores al objeto
        ruben.setNombre("Ruben");

        ruben.saludar();

        // Generamos animales

        Animal perro1 = new Animal();
        perro1.setTipo("perro");

        Perro perro2 = new Perro();



    }
}
