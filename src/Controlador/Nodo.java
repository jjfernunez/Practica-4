package Controlador;

import java.io.Serializable;


public class Nodo<T> implements Serializable{
    
    private int numId;
    private T datos;
    
    public Nodo(int numId, T objeto){
        
        datos = objeto;
        
        this.numId = numId;
        
    }
    
     public void setDatos(T objeto){
        this.datos = objeto;
    }
     
    public T getDatos(){
        return datos;
    }
    
    public int getId(){
        return this.numId;
    }
    
}
