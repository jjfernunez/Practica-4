
package Controlador;


public class Lista<K> {
    
    
    
    private Nodo[] vector;
    
    
    public Lista(int tam){
        
        vector = new Nodo[tam];
        
    }
    public void insertar(int id, K objeto ){
        
        vector[encontrarLugar()] = new Nodo(id, objeto);
        
        
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
}
