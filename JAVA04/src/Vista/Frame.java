package Vista;

import Controlador.*;
import Modelo.*;
import Vista.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;


public class Frame extends javax.swing.JFrame {

    

    public Frame() {
         
        Lista <Cuenta> lista = new Lista(10);
        
        lista.insertar((int)Math.random()*100, new CuentaAhorro("Juanito", 60000, 5, 7, 2022));
        lista.insertar((int)Math.random()*100, new CuentaInversion("Marcos", 1000, 5, 4, 2022));
        lista.insertar((int)Math.random()*100, new CuentaCorriente("Alberto", 15000, 5, 10, 2021, 0.5f, true));
        lista.insertar((int)Math.random()*100, new CuentaCorriente("Ana", 22000, 5, 5, 2022, 0.5f, false));
        lista.insertar((int)Math.random()*100, new CuentaAhorro("Paula", 35000, 5, 7, 2022));
        
        
        initComponents();
        
        ocultarBotones();
        
        Cuenta cuentaActual = (Cuenta)lista.getNodo(0).getDatos();
        
        numCuenta.setText(""+cuentaActual.getNumero());
        diaF.setText("" + cuentaActual.getFecha().get(Calendar.DATE));
        mesF.setText("" + cuentaActual.getFecha().get(Calendar.MONTH));
        anioF.setText("" + cuentaActual.getFecha().get(Calendar.YEAR));
        saldoCuenta.setText(""+cuentaActual.getSaldo());
        propCuenta.setText(""+cuentaActual.getTitular());
        
        botonAceptar.setVisible(false);
        botonCancelar.setVisible(false);
        
        botonAnterior.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                if(lista.getNodo(-1) != null){
                    lista.retroceder();
                    Cuenta C = (Cuenta)lista.getNodo(0).getDatos();
                    
                    numCuenta.setText("" + C.getNumero());
                    diaF.setText("" + C.getFecha().get(Calendar.DATE));
                    mesF.setText("" + C.getFecha().get(Calendar.MONTH));
                    anioF.setText("" + C.getFecha().get(Calendar.YEAR));
                    saldoCuenta.setText("" + C.getSaldo());
                    propCuenta.setText("" + C.getTitular());
                }

            }
        });
        
        botonSiguiente.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                if(lista.getNodo(1) != null){
                    lista.avanzar();
                    Cuenta C = (Cuenta)lista.getNodo(0).getDatos();
                    
                    numCuenta.setText("" + C.getNumero());
                    diaF.setText(""+C.getFecha().get(Calendar.DATE));
                    mesF.setText(""+C.getFecha().get(Calendar.MONTH));
                    anioF.setText(""+C.getFecha().get(Calendar.YEAR));
                    saldoCuenta.setText("" + C.getSaldo());
                    propCuenta.setText("" + C.getTitular());
                }

            }
        });
        
        botonCrear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                GregorianCalendar fechaActual = new GregorianCalendar(new Locale("es", "ES"));
                numCuenta.setText("Autonumerico");
                numCuenta.setBackground(Color.GRAY);
                diaF.setText("dd");
                mesF.setText("mm");
                anioF.setText("yyyy");
                saldoCuenta.setText("");
                propCuenta.setText("");
                
                propCuenta.setEditable(true);
                saldoCuenta.setEditable(true);
                
                botonCrear.setVisible(false);
                botonAnterior.setVisible(false);
                botonSiguiente.setVisible(false);
                botonAceptar.setVisible(true);
                botonCancelar.setVisible(true);
                
                botonAceptar.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e){
                        GregorianCalendar fecha = new GregorianCalendar(new Locale("es", "ES"));
                        String dia = diaF.getText();
                        String mes = mesF.getText();
                        String anio = anioF.getText();
                        String propietario = propCuenta.getText();
                        float saldo = Float.parseFloat(saldoCuenta.getText());
                        //GregorianCalendar fecha = new GregorianCalendar(new Locale("es", "ES"));
                        
                        if(dia.equalsIgnoreCase("dd") || dia.equalsIgnoreCase("") || mes.equalsIgnoreCase("mm") || mes.equalsIgnoreCase("")|| anio.equalsIgnoreCase("yyyy") || anio.equalsIgnoreCase("")){
                           
                            /*switch(){
                                case 1: 
                                case 2:lista.insertar(((int)Math.random()*100), new Cuenta(propietario, saldo,fecha.get(Calendar.YEAR), fecha.get(Calendar.MONTH), fecha.get(Calendar.DATE)));
                                    break;
                                case 3:lista.insertar(((int)Math.random()*100), new Cuenta(propietario, saldo,fecha.get(Calendar.YEAR), fecha.get(Calendar.MONTH), fecha.get(Calendar.DATE)));
                                    break;
                                    
                            }*/
                        }
                        else
                        {
                            int dia1 = Integer.parseInt(dia);
                            int mes1 = Integer.parseInt(mes);
                            int anio1 = Integer.parseInt(anio);
                           /*  switch(){
                                case 1: 
                                case 2:lista.insertar(((int)Math.random()*100), new Cuenta(propietario, saldo,fecha.get(Calendar.YEAR), fecha.get(Calendar.MONTH), fecha.get(Calendar.DATE)));
                                    break;
                                case 3:lista.insertar(((int)Math.random()*100), new Cuenta(propietario, saldo,fecha.get(Calendar.YEAR), fecha.get(Calendar.MONTH), fecha.get(Calendar.DATE)));
                                    break;
                                    
                            }*/
                        }
                        
                        propCuenta.setEditable(false);
                        saldoCuenta.setEditable(false);
                        diaF.setEditable(false);
                        mesF.setEditable(false);
                        anioF.setEditable(false);
                        numCuenta.setBackground(null);
                        
                        botonSiguiente.setVisible(true);
                        botonAnterior.setVisible(true);
                        botonAceptar.setVisible(false);
                        botonCancelar.setVisible(false);
                        botonCrear.setVisible(true);
                       
                    }
                });
                
                botonCancelar.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e){
                        botonSiguiente.setVisible(true);
                        botonAnterior.setVisible(true);
                        botonAceptar.setVisible(false);
                        botonCancelar.setVisible(false);
                        botonCrear.setVisible(true);
                        
                        numCuenta.setBackground(null);
                        
                        
                    }
                });
            }
        });
        
       
        
    }
    
    private void ocultarBotones(){
        numCuenta.setVisible(false);
        diaF.setVisible(false);
        mesF.setVisible(false);
        anioF.setVisible(false);
        saldoCuenta.setVisible(false);
        propCuenta.setVisible(false);         
        botonCrear.setVisible(false);
        botonAnterior.setVisible(false);
        botonSiguiente.setVisible(false);
        botonAceptar.setVisible(false);
        botonCancelar.setVisible(false);
        JLabelNumCuenta.setVisible(false);
        JLabelProp.setVisible(false);
        JLabelFecha.setVisible(false);
        JLabelSaldo.setVisible(false);
        menu.setVisible(true);  
    }
    
        private void mostrarBotones(){
        numCuenta.setVisible(true);
        diaF.setVisible(true);
        mesF.setVisible(true);
        anioF.setVisible(true);
        saldoCuenta.setVisible(true);
        propCuenta.setVisible(true);         
        JLabelNumCuenta.setVisible(true);
        JLabelProp.setVisible(true);
        JLabelFecha.setVisible(true);
        JLabelSaldo.setVisible(true);
        menu.setVisible(false);  
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        JLabelNumCuenta = new javax.swing.JLabel();
        JLabelProp = new javax.swing.JLabel();
        JLabelFecha = new javax.swing.JLabel();
        JLabelSaldo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        numCuenta = new javax.swing.JTextField();
        propCuenta = new javax.swing.JTextField();
        diaF = new javax.swing.JTextField();
        mesF = new javax.swing.JTextField();
        anioF = new javax.swing.JTextField();
        saldoCuenta = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        botonAceptar = new javax.swing.JButton();
        botonCrear = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        botonCargar = new javax.swing.JMenu();
        botonGuardar = new javax.swing.JMenu();
        botonInsertar = new javax.swing.JMenu();
        botonVisual = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLabelNumCuenta.setText("Numero Cuenta");

        JLabelProp.setText("Propietario");

        JLabelFecha.setText("Fecha");

        JLabelSaldo.setText("Saldo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelNumCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelProp)
                            .addComponent(JLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JLabelNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelProp)
                .addGap(45, 45, 45)
                .addComponent(JLabelFecha)
                .addGap(36, 36, 36)
                .addComponent(JLabelSaldo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        numCuenta.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saldoCuenta)
                    .addComponent(numCuenta)
                    .addComponent(propCuenta)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(diaF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mesF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anioF)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(propCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(saldoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCrear.setText("Crear Cuenta");

        botonCancelar.setText("Cancelar");

        botonAnterior.setText("Anterior");

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        botonCargar.setText("Cargar");
        botonCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCargarMouseClicked(evt);
            }
        });
        menu.add(botonCargar);

        botonGuardar.setText("Guardar");
        botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarMouseClicked(evt);
            }
        });
        menu.add(botonGuardar);

        botonInsertar.setText("Insertar");
        botonInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInsertarMouseClicked(evt);
            }
        });
        menu.add(botonInsertar);

        botonVisual.setText("Visualizar");
        botonVisual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVisualMouseClicked(evt);
            }
        });
        menu.add(botonVisual);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVisualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVisualMouseClicked
        mostrarBotones();
        botonCrear.setVisible(false);
        botonAnterior.setVisible(true);
        botonSiguiente.setVisible(true);
        botonAceptar.setVisible(false);
        botonCancelar.setVisible(true);
    }//GEN-LAST:event_botonVisualMouseClicked

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed

    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInsertarMouseClicked
        mostrarBotones();
        botonCrear.setVisible(false);
        botonAnterior.setVisible(true);
        botonSiguiente.setVisible(true);
        botonAceptar.setVisible(true);
        botonCancelar.setVisible(true);
    }//GEN-LAST:event_botonInsertarMouseClicked

    private void botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseClicked
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("DatosLista.dat"));
            
            salida.writeObject(Frame.lista);
            
            salida.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }
    }//GEN-LAST:event_botonGuardarMouseClicked

    private void botonCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCargarMouseClicked
       try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("DatosLista.dat"));
            
            entrada.readObject(Frame.lista);
            
            entrada.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }
    }//GEN-LAST:event_botonCargarMouseClicked

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

    }//GEN-LAST:event_botonAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    
     public Lista getLista(){
            return lista;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelFecha;
    private javax.swing.JLabel JLabelNumCuenta;
    private javax.swing.JLabel JLabelProp;
    private javax.swing.JLabel JLabelSaldo;
    private javax.swing.JTextField anioF;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JMenu botonCargar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JMenu botonGuardar;
    private javax.swing.JMenu botonInsertar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JMenu botonVisual;
    private javax.swing.JTextField diaF;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextField mesF;
    private javax.swing.JTextField numCuenta;
    private javax.swing.JTextField propCuenta;
    private javax.swing.JTextField saldoCuenta;
    // End of variables declaration//GEN-END:variables
}
