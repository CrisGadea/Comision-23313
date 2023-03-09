package com.example.comision23313.clases;

public class Prueba {
    public static void main(String[] args) {
        // Todas las clases en Java heredan de la Clase Object
        //System.out.println("Hola mundo");

        // Instanciar una clase
        /*
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

        Perro perro2 = new Perro("lolo", "chihuahua", 2, "marron", "perro");
        Gato gato1 = new Gato("Cleo", "mestiza", 2);
        Pez pez = new Pez();

        System.out.println(perro2.moverse());
        System.out.println(gato1.moverse());
        System.out.println(pez.moverse());
        */

        Tamagotchi tama = new Tamagotchi();
        tama.setNombre("Pipi");
        tama.setEstado("hambrienta");
        // Consulto el estado de Pipi
        System.out.println("Pipi esta " + tama.getEstado());
        // Le damos de comer a Pipi
        tama.comer();
        // Consultamos el estado de Pipi luego de que comió
        System.out.println("Luego de comer, Pipi esta " + tama.getEstado());

    }
}
