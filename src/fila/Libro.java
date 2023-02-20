/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author Danchita45
 */
public class Libro {
    
    String Titulo;
    
    String Autor;
    String Editorial;

    public Libro() {
    }

    
    public Libro(String Titulo, String Autor, String Editorial) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", Editorial=" + Editorial + '}';
    }
    
    
    
}
