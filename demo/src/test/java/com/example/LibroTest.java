package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;


public class LibroTest {
    @Test
    @DisplayName("Libro creado tiene titulo correcto")
    public void libroCreadoTitulo()
    {
        Libro libro1 = new Libro("El Quijote");
        assertEquals("El Quijote", libro1.getTitulo());
    }

    @Test
    @DisplayName("Libro creado no esta prestado")
    public void libroCreadoPrestado()
    {
        Libro libro1 = new Libro("El Quijote");
        assertFalse(libro1.getPrestado());
    }

    @Test
    @DisplayName("Prestar correctamente")
    public void prestarCorrectamente()
    {
        Libro libro1 = new Libro("El Quijote");
        libro1.prestar();
        boolean prueba = libro1.getPrestado();
        assertTrue(prueba);
    }
    @Test
    @DisplayName("No se puede prestar un libro que ya está prestado")
    public void libroPrestado()
    {
        Libro libro1 = new Libro("El Quijote");
        libro1.prestar();
        libro1.prestar();
        boolean resultado = libro1.prestar();
        assertFalse(resultado);
    }
    @Test
    @DisplayName("Devolver correctamente")
    public void devolverCorrectamente()
    {
        Libro libro1 = new Libro("El Quijote");
        libro1.prestar();
        libro1.devolver();
        assertFalse(libro1.getPrestado());
    }
    @Test
    @DisplayName("No se puede devolver un libro que no está prestado")
    public void devolverNoPrestado()
    {
        Libro libro1 = new Libro("El Quijote");
        boolean resultado = libro1.devolver();
        assertFalse(resultado);
    }
    @Test
    @DisplayName("Anadir libro correctamente")
    public void anadirLibro()
    {
        Biblioteca biblioteca1 = new Biblioteca(new String[100]);
        Libro libro1 = new Libro("El Quijote");
        biblioteca1.anadirLibro(libro1);
        assertEquals(1, biblioteca1.getNumeroLibros());
    }
    @Test
    @DisplayName("Numero total es correcto")
    public void anadirLibros()
    {   
        Biblioteca biblioteca1 = new Biblioteca(new String[100]);
        Libro libro1 = new Libro("El Quijote");
        biblioteca1.anadirLibro(libro1);
        assertEquals(1, biblioteca1.getNumeroLibros());
        
        Libro libro2 = new Libro("Cien anos de soledad");
        biblioteca1.anadirLibro(libro2);
        assertEquals(2, biblioteca1.getNumeroLibros());
    }
}