package com.example.comision23313.clases;

import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {

    @Test
    public void testQuePruebaQuePuedoCrearUnTamagotchiConNombre(){
        Tamagotchi mascota = new Tamagotchi("Tama");

        Assert.assertEquals(mascota.getNombre(),"Tama");
    }

    @Test
    public void testQuePruebaQueAlComerConEstadoHambrientaCambiaElEstadoAContenta(){
        Tamagotchi mascota = new Tamagotchi();
        mascota.setEstado("hambrienta");
        mascota.comer();
        Assert.assertEquals(mascota.getEstado(),"contenta");
    }


}
