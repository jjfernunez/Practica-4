package java04;

import Modelo.*;
import Controlador.*;
import java.io.*;


public class JAVA04 {

    
    public static void main(String[] args) {
        
        
        
        Lista <Cuenta> lista = new <Cuenta> Lista(10);
        
        lista.insertar(0, new CuentaAhorro("Juanito", 60000, 5, 7, 2022));
        lista.insertar(2, new CuentaInversion("Marcos", 1000, 5, 4, 2022));
        lista.insertar(3, new CuentaCorriente("Alberto", 15000, 5, 10, 2021, 0.5f, true));
        lista.insertar(1, new CuentaCorriente("Ana", 22000, 5, 5, 2022, 0.5f, false));
        lista.insertar(5, new CuentaAhorro("Paula", 35000, 5, 7, 2022));
        
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("DatosLista.dat"));
            
            salida.writeObject(lista);
            
            salida.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }
    }
    
}
