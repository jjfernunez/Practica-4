package Vista;

import Controlador.*;
import Modelo.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Ordenar extends javax.swing.JPanel {

    public Ordenar(Lista <Cuenta> lista) {
        
       
        
        initComponents();
        
        int tam = 100000;
        
        Lista listaVector = new Lista(tam);
        ArrayList listaArray = new ArrayList();
        
        for(int i = 0; i < tam-1;i++){
            
            listaVector.insertar((int)Math.floor(Math.random()*10000 + 1000), new CuentaAhorro("Prueba", (float)Math.floor(Math.random()*10000 + 1000), 12,12,2022));
            
           
            
        }
        long startTime = System.nanoTime();    
        listaVector.ordenarLista();   
        
        for(int i = 0; i< 100; i++){
            Nodo nodo = listaVector.getNodo(i);
            System.out.println(nodo.getId());
        }
        System.out.println("Ordenado");
        long estimatedTime = System.nanoTime() - startTime;
         TimeUnit.SECONDS.convert(estimatedTime, TimeUnit.NANOSECONDS);
        ArrayTexto.setText("La ordenacion de burbuja ha tardado "+(double)(estimatedTime/1000000000)+" segundos");
        
        for(int i = 0; i < tam -1; i++){
        listaArray.add(new Nodo((int)Math.floor(Math.random()*10000 + 1000), new CuentaAhorro("Prueba", (float)Math.floor(Math.random()*10000 + 1000), 12,12,2022)));
            
        }
        
        startTime = System.nanoTime();    
        Collections.sort(listaArray);   
        System.out.println("Ordenado");
      
        
        for( Object nodo : listaArray){
            
            Nodo nod = (Nodo)nodo;
            System.out.println(nod.getId());
            
            
        }
        estimatedTime = System.nanoTime() - startTime;
        TimeUnit.SECONDS.convert(estimatedTime, TimeUnit.NANOSECONDS);
        listTexto.setText("La ordenacion por sort ha tardado "+(double)(estimatedTime/1000000000)+" segundos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ArrayTexto = new javax.swing.JLabel();
        listTexto = new javax.swing.JLabel();

        ArrayTexto.setText("La ordenacion de burbuja ha tardado:");

        listTexto.setText("El metodo sort ha tardado: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(listTexto)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ArrayTexto)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(ArrayTexto)
                .addGap(94, 94, 94)
                .addComponent(listTexto)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArrayTexto;
    private javax.swing.JLabel listTexto;
    // End of variables declaration//GEN-END:variables
}
