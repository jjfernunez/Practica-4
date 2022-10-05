
package Modelo;

import java.io.Serializable;


public class CuentaInvesion extends Cuenta implements Serializable, Fecha {
    
    private float benePer;
    private String sucursal = "IES MAJUELO";
    
    public CuentaInvesion(String titular, float saldo, int dia, int mes, int ano){
        super(titular, saldo, dia, mes , ano);
       
        
    }

 
    public int generarBenePer(){
        
        return (int)Math.random()*(11)-11;
        
    }
    
    public float getBenePer() {
        return benePer;
    }

    
    public void setBenePer(float benePer) {
        this.benePer = benePer;
    }

    
    public String getSucursal() {
        return sucursal;
    }

    
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    
    @Override
  public int getDia(){return 0;}
  
  @Override
  public int getMes(){
  
  return this.getFecha().get(MES_DEL_ANO);
  }
  

  
  
  @Override
  public int getAno(){return 0;};
}
