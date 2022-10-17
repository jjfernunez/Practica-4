package Vista;

import Controlador.*;
import Modelo.*;
import Vista.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JOptionPane;

public class Visualizar extends javax.swing.JPanel  {

    public Visualizar(Lista <Cuenta> lista) {
        
        
        
       try{
        initComponents();
        Cuenta cuentaActual = (Cuenta)lista.getNodo(0).getDatos();
        GregorianCalendar fecha = new GregorianCalendar();
        
        if(lista.getPosicion() == 0){
            botonAnterior.setEnabled(false);
        }
         if(lista.getNodo(1)== null){
            botonSiguiente.setEnabled(false);
        }
        
        if(cuentaActual instanceof CuentaAhorro){  
            titulo.setText("CUENTA AHORRO");
            if(((CuentaAhorro) cuentaActual).getDia() == fecha.get(Calendar.DATE)){
                botonCalcular.setEnabled(true);
            }
            else{
                botonCalcular.setEnabled(false);
            }
                    
        }else if(cuentaActual instanceof CuentaCorriente){   
            titulo.setText("CUENTA CORRIENTE");
            if(((CuentaCorriente) cuentaActual).isSemestral()){
                if (((CuentaCorriente) cuentaActual).getMes() + 6 == fecha.get(Calendar.MONTH)) {
                    botonCalcular.setEnabled(true);
                } else {
                    botonCalcular.setEnabled(false);
                }
            }
            else{
                if (((CuentaCorriente) cuentaActual).getAno() + 1== fecha.get(Calendar.YEAR)) {
                    botonCalcular.setEnabled(true);
                } else {
                    botonCalcular.setEnabled(false);
                }
            }
            
        }else{ 
            titulo.setText("CUENTA INVERSION");
            if(((CuentaInversion) cuentaActual).getMes()+3 == fecha.get(Calendar.MONTH)){
                botonCalcular.setEnabled(true);
            }
            else{
                botonCalcular.setEnabled(false);
            }
        }
        
        numCuenta.setText(""+cuentaActual.getNumero());
        diaF.setText("" + cuentaActual.getFecha().get(Calendar.DATE));
        mesF.setText("" + cuentaActual.getFecha().get(Calendar.MONTH));
        anioF.setText("" + cuentaActual.getFecha().get(Calendar.YEAR));
        saldoCuenta.setText(""+cuentaActual.getSaldo());
        if(cuentaActual.getTitular() != null)
            propCuenta.setText("" + cuentaActual.getTitular());
        else{
            propCuenta.setText("*********");
        }
        
        botonAnterior.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                GregorianCalendar fecha = new GregorianCalendar();                    
                if(lista.getNodo(-1) != null){
                    lista.retroceder();
                    Cuenta C = (Cuenta)lista.getNodo(0).getDatos();
                    botonSiguiente.setEnabled(true);
                    
                    numCuenta.setText("" + C.getNumero());
                    diaF.setText("" + C.getFecha().get(Calendar.DATE));
                    mesF.setText("" + C.getFecha().get(Calendar.MONTH));
                    anioF.setText("" + C.getFecha().get(Calendar.YEAR));
                    saldoCuenta.setText("" + C.getSaldo());
                    if(C.getTitular() != null)
                    propCuenta.setText("" + C.getTitular());
                    else{
                         propCuenta.setText("*********");
                    }
                    
                    if(lista.getNodo(0) == lista.getNodo(-lista.getPosicion())){
                        botonAnterior.setEnabled(false);
                    }
                }
                Cuenta cuen = (Cuenta)lista.getNodo(0).getDatos();
                if(cuen instanceof CuentaAhorro){  
                    titulo.setText("CUENTA AHORRO");
                if(((CuentaAhorro) cuen).getMes()+1 == fecha.get(Calendar.MONTH)){
                    botonCalcular.setEnabled(true);
                }
                else{
                    botonCalcular.setEnabled(false);
                }
                    
                }else if(cuen instanceof CuentaCorriente){   
                    titulo.setText("CUENTA CORRIENTE");
                if(((CuentaCorriente) cuen).isSemestral()){
                    if (((CuentaCorriente) cuen).getMes() + 6 == fecha.get(Calendar.MONTH)) {
                        botonCalcular.setEnabled(true);
                    } else {
                        botonCalcular.setEnabled(false);
                    }
                }
                else{
                    if (((CuentaCorriente) cuen).getAno() + 1== fecha.get(Calendar.YEAR)) {
                        botonCalcular.setEnabled(true);
                    } else {
                        botonCalcular.setEnabled(false);
                    }
                }
            
                }else{ 
                    titulo.setText("CUENTA INVERSION");
                    if(((CuentaInversion) cuen).getMes()+3 == fecha.get(Calendar.MONTH)){
                        botonCalcular.setEnabled(true);
                    }
                    else{
                        botonCalcular.setEnabled(false);
                    }
                }
        
            }
        });
        
        botonSiguiente.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                GregorianCalendar fecha = new GregorianCalendar();
                if(lista.getNodo(1) != null){
                    lista.avanzar();
                    Cuenta C = (Cuenta)lista.getNodo(0).getDatos();
                    botonAnterior.setEnabled(true);
                    
                    numCuenta.setText("" + C.getNumero());
                    diaF.setText(""+C.getFecha().get(Calendar.DATE));
                    mesF.setText(""+C.getFecha().get(Calendar.MONTH));
                    anioF.setText(""+C.getFecha().get(Calendar.YEAR));
                    saldoCuenta.setText("" + C.getSaldo());
                    
                    if(C.getTitular() != null)
                    propCuenta.setText("" + C.getTitular());
                    else{
                         propCuenta.setText("*********");
                    }
                    
                    if(lista.getNodo(1) == null){
                        botonSiguiente.setEnabled(false);
                    }
                }
             Cuenta cuen = (Cuenta)lista.getNodo(0).getDatos();   
            if(cuen instanceof CuentaAhorro){  
                    titulo.setText("CUENTA AHORRO");
                if(((CuentaAhorro) cuen).getMes()+1 == fecha.get(Calendar.MONTH)){
                    botonCalcular.setEnabled(true);
                }
                else{
                    botonCalcular.setEnabled(false);
                }
                    
                }else if(cuen instanceof CuentaCorriente){   
                    titulo.setText("CUENTA CORRIENTE");
                if(((CuentaCorriente) cuen).isSemestral()){
                    if (((CuentaCorriente) cuen).getMes() + 6 == fecha.get(Calendar.MONTH)) {
                        botonCalcular.setEnabled(true);
                    } else {
                        botonCalcular.setEnabled(false);
                    }
                }
                else{
                    if (((CuentaCorriente) cuen).getAno() + 1== fecha.get(Calendar.YEAR)) {
                        botonCalcular.setEnabled(true);
                    } else {
                        botonCalcular.setEnabled(false);
                    }
                }
            
                }else{ 
                    titulo.setText("CUENTA INVERSION");
                    if(((CuentaInversion) cuen).getMes()+3 == fecha.get(Calendar.MONTH)){
                        botonCalcular.setEnabled(true);
                    }
                    else{
                        botonCalcular.setEnabled(false);
                    }
                }
        
            }
        });
        
        
        
        botonCalcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               Cuenta cuen =  (Cuenta)lista.getNodo(0).getDatos();
               
                GregorianCalendar fecha = new GregorianCalendar();
               if(cuen instanceof CuentaAhorro){
                   
                   ((CuentaAhorro) cuen).calcular();
                   titulo.setText("CUENTA AHORRO");
                   JOptionPane.showMessageDialog(saldoCuenta, "Se ha aplicacdo un interes de: "+((CuentaAhorro) cuen).getInteresMensual()+"%");
                   
                
               }else if(cuen instanceof CuentaCorriente){
                   ((CuentaCorriente) cuen).calcular();
                   titulo.setText("CUENTA CORRIENTE");
                   JOptionPane.showMessageDialog(saldoCuenta, "Se ha aplicacdo una comision de: "+((CuentaCorriente) cuen).getComision()+"%");
               }else{
                   try{
                   ((CuentaInversion) cuen).calcular();
                   }catch(ESaldoNoValido ex){
                        JOptionPane.showMessageDialog(saldoCuenta, "El saldo no puede ser menor que el saldo minimo.(Saldo minimo: 0)");
        
                   }
                   titulo.setText("CUENTA INVERSION");
                   if(((CuentaInversion) cuen).getBenePer() >= 0){
                        JOptionPane.showMessageDialog(saldoCuenta, "Se ha aplicacdo un beneficio de: "+((CuentaInversion) cuen).getBenePer()+"%");
                   }else{
                       JOptionPane.showMessageDialog(saldoCuenta, "Se ha aplicacdo una perdida de: "+((CuentaInversion) cuen).getBenePer()+"%");
                   }
               }
               
                    numCuenta.setText("" + cuen.getNumero());
                    diaF.setText(""+cuen.getFecha().get(Calendar.DATE));
                    mesF.setText(""+cuen.getFecha().get(Calendar.MONTH));
                    anioF.setText(""+cuen.getFecha().get(Calendar.YEAR));
                    saldoCuenta.setText("" + cuen.getSaldo());
                    propCuenta.setText("" + cuen.getTitular());
            }
        });
       }
       catch(NullPointerException e){
           JOptionPane.showMessageDialog(saldoCuenta, "No hay ningun dato cargado");
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        numCuenta = new javax.swing.JTextField();
        propCuenta = new javax.swing.JTextField();
        diaF = new javax.swing.JTextField();
        mesF = new javax.swing.JTextField();
        anioF = new javax.swing.JTextField();
        saldoCuenta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        botonCalcular = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();

        numCuenta.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saldoCuenta)
                    .addComponent(numCuenta)
                    .addComponent(propCuenta)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(diaF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mesF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anioF)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(propCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(saldoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jLabel1.setText("Numero Cuenta");

        jLabel2.setText("Propietario");

        jLabel3.setText("Fecha");

        jLabel4.setText("Saldo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonAnterior.setText("Anterior");

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        try{
            
                this.setVisible(false);
            
        }catch(NumberFormatException e){
            this.setVisible(false);
        }
           
    }//GEN-LAST:event_botonCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioF;
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField diaF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField mesF;
    private javax.swing.JTextField numCuenta;
    private javax.swing.JTextField propCuenta;
    private javax.swing.JTextField saldoCuenta;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
