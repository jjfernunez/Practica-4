package Modelo;

public class CuentaAhorro extends Cuenta implements Fecha{
    
    private int interesMensual = 0;
    private String sucursal = "IES MAJUELO";
    
    public CuentaAhorro(String titular, float saldo, int dia, int mes, int ano){
        super(titular, saldo, dia, mes, ano);
        this.setTipoCuenta(1); 
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
