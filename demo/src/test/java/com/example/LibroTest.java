package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class LibroTest {
    @Test
    @DisplayName("Libro creado tiene titulo correcto")
    public void libroCreado()
    {
        Libro libro1 = new Libro("El Quijote");
        assertEquals("El Quijote", libro1.getTitulo());
    }

    @Test
    @DisplayName("Libro creado no esta prestado")
    public void libroCreado()
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
        assertTrue(libro1.getPrestado());
    }
    @Test
    @DisplayName("No se puede prestar un libro que ya está prestado")
    public void libroPrestado()
    {
        Libro libro1 = new Libro("El Quijote");
        libro1.prestar();
        libro1.prestar();
        assertTrue("El libro ya está prestado", libro1.prestar());
    }
    @Test
    @DisplayName("Devolver correctamente")
    public void libroDevuelto()
    {
        Libro libro1 = new Libro("El Quijote");
        libro1.prestar();
        libro1.devolver();
        assertFalse(libro1.getPrestado());
    }
    @Test
    @DisplayName("No se puede devolver un libro que no está prestado")
    public void libroDevuelto()
    {
        Libro libro1 = new Libro("El Quijote");
        assertTrue("El libro no está prestado", libro1.devolver());
    }
    @Test
    @DisplayName("Anadir libro correctamente")
    public void anadirLibro()
    {
        Biblioteca biblioteca1 = new Biblioteca(0, new String[100]);
        Libro libro1 = new Libro("El Quijote");
        biblioteca1.anadirLibro(libro1);
        assertEquals(1, biblioteca1.getNumeroLibros());
    }
    @Test
    @DisplayName("Numero total es correcto")
    public void anadirLibros()
    {   
        Biblioteca biblioteca1 = new Biblioteca(0, new String[100]);
        Libro libro1 = new Libro("El Quijote");
        biblioteca1.anadirLibro(libro1);
        assertEquals(1, biblioteca1.getNumeroLibros());
        
        Libro libro2 = new Libro("Cien anos de soledad");
        biblioteca1.anadirLibro(libro2);
        assertEquals(2, biblioteca1.getNumeroLibros());
    }
}