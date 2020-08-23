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
public class Libros {
    

    private int ID;
    private String NombreLibro;
    private int NumeroPagina;
    private String Autor;

    public Libros(int ID,String NombreLibro,int NumeroPagina,String Autor){

    this.ID = ID;
    this.NombreLibro = NombreLibro;
    this.NumeroPagina = NumeroPagina;
    this.Autor = Autor;


    }
//Get se utiliza para recuperar informacion
    public int getID() {
        return ID;
    }
// Set se utiliza para modificar informacion
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumeroPagina() {
        return NumeroPagina;
    }

    public void setNumeroPagina(int NumeroPagina) {
        this.NumeroPagina = NumeroPagina;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "ID=" + ID + ", NombreLibro=" + NombreLibro + ", NumeroPagina=" + NumeroPagina + ", Autor=" + Autor + '}';
    }
    
    
    
    
    
}
