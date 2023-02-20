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
public class Machote {
    String Nombre;
    int anio;
    String Autor;
    String Titulo;

    public Machote() {
    }

    public Machote(String Nombre, int anio, String Autor, String Titulo) {
        this.Nombre = Nombre;
        this.anio = anio;
        this.Autor = Autor;
        this.Titulo = Titulo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Machote{" + "Nombre=" + Nombre + ", anio=" + anio + ", Autor=" + Autor + ", Titulo=" + Titulo + '}';
    }
    
    
}
