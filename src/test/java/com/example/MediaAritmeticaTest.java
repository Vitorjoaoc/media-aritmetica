package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MediaAritmeticaTest {

    @Test
    public void testMediaDeDoisNumerosPositivos() {
        double resultado = MediaAritmetica.calcularMedia(10, 20);
        assertEquals(15.0, resultado, 0.001);
    }

    @Test
    public void testMediaDeNumerosNegativos() {
        double resultado = MediaAritmetica.calcularMedia(-10, -30);
        assertEquals(-20.0, resultado, 0.001);
    }

    @Test
    public void testMediaDeZeroEPositivo() {
        double resultado = MediaAritmetica.calcularMedia(0, 10);
        assertEquals(5.0, resultado, 0.001);
    }

    @Test
    public void testMediaDeZeroEZero() {
        double resultado = MediaAritmetica.calcularMedia(0, 0);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    public void testMediaComNumerosDecimais() {
        double resultado = MediaAritmetica.calcularMedia(5.5, 6.5);
        assertEquals(6.0, resultado, 0.001);
    }
}
