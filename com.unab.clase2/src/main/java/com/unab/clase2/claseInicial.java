/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase2;

/**
 *
 * @author carlj
 */
public class claseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        /System.out.println("Hola nueva clase");
//        System.out.println(Libro.toString());
//        System.out.println(objetoLibro2.getNumeroPagina());

        Libros objetoLibro1 = new Libros(1, "Programacion Java", 100, "Deitel");
        Libros objetoLibro2 = new Libros(2, "Programacion PHP", 600, "Deitel");

        objetoLibro1.setNumeroPagina(200);

        if (objetoLibro1.getNumeroPagina() < objetoLibro2.getNumeroPagina()) {
            System.out.println("El libro 2 tiene mayor numero de paginas que el libro 1  " + objetoLibro1.getNumeroPagina() + " Paginas");
            System.out.println("La informacion del libro 2 es " + objetoLibro2.toString());
        } else {
            System.out.println("El libro 1 tiene mayor numero de paginas que el libro 2  " + objetoLibro2.getNumeroPagina() + " Paginas");
            System.out.println("La informacion del libro 1 es " + objetoLibro2.toString());

        }

    }

}
