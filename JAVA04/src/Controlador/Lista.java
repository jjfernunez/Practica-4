
package Controlador;


public class Lista<K> {
    
    
    
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
    public Nodo[] ordenarLista(Nodo[] vec){
        final int N=vec.length;
                for(int i=N-1;i>0;i--){
                        for(int j=0;j<i;j++){
                                if(vec[j].getId()>vec[j+1].getId()){
                                        Nodo temp=vec[j];
                                        vec[j]=vec[j+1];
                                        vec[j+1]=temp;
                                }
                        }
                        
                }
               return vec;
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
    
    /**
     * @param aPosicion the posicion to set
     */
    public void setPosicion(int aPosicion) {
        posicion = aPosicion;
    }
    
    public int getSize(){
        return size;
    }
}
