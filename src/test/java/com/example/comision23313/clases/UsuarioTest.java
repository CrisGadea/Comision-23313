package com.example.comision23313.clases;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {

    // Aplicamos la metodologia TDD: Primero creamos casos/pruebas
    // para crear la funcionalidad

    @Test
    public void testQuePruebaQuePuedoCrearUnUsuario(){
        Usuario user = new Usuario();

        Assert.assertNotNull(user);
    }

    @Test
    public void testQuePruebaQueElUsuarioTieneNombre(){
        // Pasos para crear un test
        // 1) Definimos los datos necesarios para nuestra prueba

        // Objeto Creado
        Usuario user = new Usuario();

        // 2) Ejecutamos la prueba
        user.setNombre("Homero");

        // 3) Validamos que la prueba obtenga el resultado esperado
        Assert.assertEquals("Homero",user.getNombre());
    }
}
