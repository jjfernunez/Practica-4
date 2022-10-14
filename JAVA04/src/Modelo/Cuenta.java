package Modelo;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Cuenta implements Serializable{
    
    private int numero;
    private transient String titular;
    private float saldo;
    private float saldoMinimo;
    private GregorianCalendar fecha;
    private int tipoCuenta;

    
    public Cuenta(){
        
        fecha = new GregorianCalendar();
        
    }
    
    public Cuenta(String titular, float saldo, int dia, int mes, int ano){
        
        this.numero = numeroAleatorio();
        this.titular = titular;
        this.saldo = saldo;
        this.saldoMinimo = 0;
        fecha = new GregorianCalendar(ano, mes, dia);
        
    }
    
    public int numeroAleatorio(){
          
        return (int)Math.floor(Math.random()*100+1);
    } 
    
    
    public int getNumero() {
        return numero;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public String getTitular() {
        return titular;
    }

    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    public float getSaldo() {
        return saldo;
    }

    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    public float getSaldoMinimo() {
        return saldoMinimo;
    }

    
    public void setSaldoMinimo(float saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    
    public GregorianCalendar getFecha() {
        return fecha;
    }

   
    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipoCuenta
     */
    public int getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    
    
    
}
