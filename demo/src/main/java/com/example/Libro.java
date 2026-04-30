package com.example;

public class Libro {
    private String titulo;
    private boolean prestado=false;

    public Libro (String titulo){    
        this.titulo = titulo;
    }
    // Métodos
    public String getTitulo (){    
        return titulo;
    }
    public void getPrestado (){    
        if (prestado == true){
            System.out.println ("El libro está prestado");
        } else {
            System.out.println ("El libro no está prestado");
        }
    }
    public void prestar (){    
        if (prestado == true){
            System.out.println ("El libro ya está prestado");
        } else {
            prestado = true;
            System.out.println ("El libro ha sido prestado");
        }
    }
    public void devolver (){    
        if (prestado == false){
            System.out.println ("El libro no está prestado");
        } else {
            prestado = false;
            System.out.println ("El libro ha sido devuelto");
        }
    }

}
