package Controlador;

import java.io.Serializable;


public class Nodo<T> implements Serializable, Comparable <Nodo>{
    
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
    public void setId(int newId){
        this.numId = newId;
    }

    @Override
    public int compareTo(Nodo o) {
       if(this.numId==o.getId())  
      return 0;  
   else if(this.numId>o.getId())  
      return 1;  
   else  
      return -1;
    }
    
}
