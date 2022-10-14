
package Modelo;

import java.io.Serializable;


public class CuentaInversion extends Cuenta implements Serializable, Fecha {
    
    private float benePer;
    private String sucursal = "IES MAJUELO";
    
    public CuentaInversion(String titular, float saldo, int dia, int mes, int ano){
        super(titular, saldo, dia, mes , ano);
       this.setTipoCuenta(2);
        
    }

    public void calcular(){
       
       this.setSaldo(this.getSaldo() +((this.getSaldo() * generarBenePer())/100)); 
    }
     
    public float generarBenePer(){
        
        this.benePer =  (int)Math.floor(Math.random()*(11)-11);
        return benePer;
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
