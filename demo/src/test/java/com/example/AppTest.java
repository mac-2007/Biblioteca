package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void libroPrestado()
    {
        Libro libro1 = new Libro("El Quijote");
        libro1.prestar();
        libro1.getPrestado();
        libro1.prestar();
        assert True ("El libro ya está prestado", libro1.prestado);
    }
}
s