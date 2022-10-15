
package Controlador;


public class Lista<K>{
    
    
    
    private Nodo[] vector;
    private int posicion = 0;
    private int size;
    
    public Lista(int tam){
        
        vector = new Nodo[tam];
        this.size = tam;
    }
    
    
    public void avanzar(){
       if(posicion < size){
            posicion += 1;
        } 
    }
    
    public void retroceder(){
        if(posicion >= 0){
            posicion -= 1;
        }
    }
    
    
    public void insertar(int id, K objeto ){
        
        vector[encontrarLugar()] = new Nodo(id, objeto);
        
        
    }
    
     public void insertar(Nodo objeto ){
        
        vector[encontrarLugar()] = objeto;
        
        
    }
    
    public int encontrarLugar(){
        
        int i;
        
        for(i = 0;i< vector.length;i++){
            
            if(vector[i] == null){
                break;
            }
            
        }
        
        return i;
    }
    public void ordenarLista(){
        
            int n = this.vector.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                try{
                if (this.vector[j].getId() > this.vector[j + 1].getId()) {
                    // swap arr[j+1] and arr[j]
                    Nodo temp = this.vector[j];
                    this.vector[j] = this.vector[j + 1];
                    this.vector[j + 1] = temp;
                    
                }   
                }
                catch(NullPointerException e){
                    System.out.println("Nulo");
                }
        
        
               
        
             
    }

    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
    }

    public Nodo getNodo(int add){
        return vector[posicion + add];
    }
    public Nodo getNodoInicial(int pos){
        return vector[pos];
    }
    /**
     * @param aPosicion the posicion to set
     */
    public void setPosicion(int aPosicion) {
        posicion = aPosicion;
    }
    
    public int getSize(){
        return size;
    }
    
    public Nodo[] getVector(){
        return this.vector;
    }

  
}
