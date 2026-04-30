package com.example;

public class Biblioteca {
    private int librosAlmacenados;
}
public Biblioteca (int librosAlmacenados){    
    this.librosAlmacenados = librosAlmacenados;
}

public void anadirLibros (int cantidad){    
    librosAlmacenados = librosAlmacenados + cantidad;
    System.out.println ("Se han añadido " + cantidad + " libros a la biblioteca");
}
