package Modelo;

import java.io.Serializable;

public class CuentaAhorro extends Cuenta implements Serializable, Fecha{
    
    private int interesMensual;
    private String sucursal;
    
    public CuentaAhorro(String titular, float saldo, int dia, int mes, int ano, int interesAnual, String sucursal){
        super(titular, saldo, dia, mes, ano);
        this.interesMensual = interesAnual;
        this.sucursal = sucursal;
    }
    
    public int getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(int interesMensual) {
        this.interesMensual = interesMensual;
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
    public int getAno(){
        return this.getFecha().get(MES_DEL_ANO);
    }
}
