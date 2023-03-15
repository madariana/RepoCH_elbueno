package pruebasJunitmm.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test

CalculadoraTest {
    private Calculadora ct;
    private Calculadora ct1 = null;
    @BeforeEach
    public void configurandoBefor() {
        ct = new Calculadora();
        System.out.println("Ejecutando BeforeEach ---> configurandoBefore()");
    }
    @AfterEach
    public void configurandoAfter() {
        ct = null; 
        System.out.println("Ejecutando AfterEach ---> configurandoAfter");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }
    @Test
    void calculadoraNull() {
        assertNull(ct1, "La clase es una instancia no nula");
        System.out.println("***  Ejecutando el primer test ---> calculadora   ***");
    }
    @Test
    public void calculadoraNotNull() {
        assertNotNull(ct);
        System.out.println("***  Ejecutando el segundo test ---> calculadora   ***");
    }
    
    /* ****************PRIMERAS PRUEBAS********************* */
    
    @Test
    public void primerosAssert() {
        /*
         * 1. Indicar que se va a evaluar
         * 2. Que es lo que se va a realizar
         * 3. Evaluar con el Assert indicado
         * */
        
        int resultadoEsperado = 10;
        int resultadoActual;
        resultadoActual = ct.sumar(5,5);
        assertEquals(resultadoEsperado, resultadoActual);
        System.out.println("***  Ejecutando 3er test ---> primerosAssert()  ***");
        
    }
    @Test
    public void sumaTest() {
        Calculadora calculadora = new Calculadora();
        assertEquals(20, calculadora.sumar(10, 10));
        System.out.println("***  Ejecutando 4to test ---> primerosAssert()  ***");
    }