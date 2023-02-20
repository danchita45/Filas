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
public class Fila1<T> implements Machote1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
    T cola[] = null;
    int atras = -1;

    Fila1(T array[]) {
        this.cola = array;
    }

    Fila1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean vacio() {
        return  cola.length == -1;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean llena() {
        return atras == cola.length - 1; 
    }

    @Override
    public void inserta(Object obj) {
        if (!llena()) {
            cola[++atras] = (T) obj;
        } else {
            System.out.println("cola llena");

        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object elimina() {
        if(!vacio()){
            Object obj = cola[0];
            for(int i =0; i<atras;i++){
                cola[i]=cola[i+1];
                
            }
            atras--;
            return obj;
        }else{
            System.out.println("Cola Vacia");
            return null;
        }
        
    }

}
