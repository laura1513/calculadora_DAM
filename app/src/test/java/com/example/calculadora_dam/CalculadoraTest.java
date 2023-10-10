package com.example.calculadora_dam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testAdd2Operands() {
        int total = Integer.parseInt(Calculadora.calcular("5+3"));
        assertEquals("X + Y operations not working correcty", 8, total);
    }
    @Test
    public void testAdd1Operand() {
        int total = Integer.parseInt(Calculadora.calcular("4+3+1"));
        assertEquals("+X operations not working correctly" ,8, total);
    }
    @Test
    public void testMult2Operands() {
        int total = Integer.parseInt(Calculadora.calcular("4*2"));
        assertEquals("4*X operations not working correctly", 8, total);
    }
    @Test
    public void dosPorTres() {
        int total = Integer.parseInt(Calculadora.calcular("2*3"));
        assertEquals("2*X operations not working correctly", 6, total);
    }
    @Test
    public void unoPorDosPorOcho() {
        int total = Integer.parseInt(Calculadora.calcular("1*2*8"));
        assertEquals("1*X*Y operations not working correctly", 16, total);
    }
    @Test
    public void dosPorDosMasTres() {
        int total = Integer.parseInt(Calculadora.calcular("2*2+3"));
        assertEquals("2*X+Y operations not working correctly", 7, total);
    }
    @Test
    public void tresMasDosPorDos() {
        int total = Integer.parseInt(Calculadora.calcular("3+2*2"));
        assertEquals("3+X*Y operations not working correctly", 7, total);
    }
    @Test
    public void tresMasDosPorDosMasCuatro() {
        int total = Integer.parseInt(Calculadora.calcular("3+2*2+4"));
        assertEquals("3*X*Y+Z operations not working correctly", 11, total);
    }
}
