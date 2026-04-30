package com.example;

public class Biblioteca {
    private String [] libros;
    private int librosAlmacenados;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public Biblioteca (String [] libros){    
        this.libros = libros;
        this.librosAlmacenados = 0;
    }

    public void getNumeroTotal (){    
        System.out.println ("El número total de libros en la biblioteca es: " + librosAlmacenados);
    }
    
    public int getNumeroLibros (){    
        return librosAlmacenados;
    }

    public void anadirLibro (Libro libro){   
        libros[librosAlmacenados] = libro.getTitulo();
        librosAlmacenados++; 
        System.out.println ("El libro " + libro.getTitulo() + " ha sido añadido a la biblioteca");
    }
}
