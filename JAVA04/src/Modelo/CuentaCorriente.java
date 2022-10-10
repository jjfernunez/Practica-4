package Modelo;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class CuentaCorriente extends Cuenta implements Serializable, Fecha {
    
    private float comision;
    private boolean semestral;
    
    public CuentaCorriente(String titular, float saldo, int dia, int mes, int ano, float comision, boolean tipo){
        super(titular, saldo, dia, mes, ano);
        this.comision = comision;
        this.semestral = tipo;
        this.setTipoCuenta(3);
        
    }

    public float calcularComision(){
       
        return this.getSaldo() - comision; 
    }
    
    public float getComision() {
        return comision;
    }

    
    public void setComision(float comision) {
        this.comision = comision;
    }

    
    public boolean isSemestral() {
        return semestral;
    }

    
    public void setSemestral(boolean semestral) {
        this.semestral = semestral;
    }
    
    @Override
  public int getDia(){return 0;}
  
  @Override
  public int getMes(){
  return this.getFecha().get(MES_DEL_ANO);
  }
  
  @Override
  public int getAno(){
  return this.getFecha().get(ANO);
  }
    
}
