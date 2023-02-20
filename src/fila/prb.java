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
public class prb {
    public static void main(String[] args) {
        Fila f = new Fila();
        Libro l = new Libro();
        l.Autor= "Daniel";
        l.Editorial="Editorial1";
        l.Titulo="Titulo";
        f.inserta(l);
        
        
    }
    
}
