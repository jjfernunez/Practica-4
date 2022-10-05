package Controlador;


public class Nodo<T> {
    
    private int numId;
    private T datos;
    
    public Nodo(int numId, T objeto){
        
        datos = objeto;
        
        this.numId = numId;
        
    }
    
    public T getDatos(){
        return datos;
    }
    
    public int getId(){
        return this.numId;
    }
    
}
