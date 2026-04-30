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
    public boolean getPrestado (){    
        if (prestado == true){
            System.out.println ("El libro está prestado");
            return true;
        } else {
            System.out.println ("El libro no está prestado");
            return false;
        }
    }
    public boolean prestar (){    
        if (prestado == true){
            System.out.println ("El libro ya está prestado");
            return false;
        } else {
            prestado = true;
            System.out.println ("El libro ha sido prestado");
            return true;
        }
    }
    public boolean devolver (){    
        if (prestado == false){
            System.out.println ("El libro no está prestado");
            return false;
        } else {
            prestado = false;
            System.out.println ("El libro ha sido devuelto");
            return true;
        }
    }

}
