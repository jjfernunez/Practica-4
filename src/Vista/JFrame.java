
package Vista;

import Controlador.*;
import Modelo.*;
import Vista.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class JFrame extends javax.swing.JFrame {

    private Lista <Cuenta> lista;

    public JFrame() {
        
        int tam = 100;
        lista = new Lista(tam);     
        
        initComponents();    
        
    }
    
    public Lista getLista(){
        
        return this.lista;
    }
        
    public void actualizarPanel(javax.swing.JPanel panel){
        this.setContentPane(panel);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cargar = new javax.swing.JMenu();
        guardar = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        BCuentaAhorro = new javax.swing.JMenuItem();
        BCuentaCorriente = new javax.swing.JMenuItem();
        BCuentaInversion = new javax.swing.JMenuItem();
        Visualizar = new javax.swing.JMenu();
        verDatos = new javax.swing.JMenuItem();
        verLista = new javax.swing.JMenuItem();
        Ordenar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Linux Biolinum O", 0, 48)); // NOI18N
        jLabel1.setText("PRACTICA 4");

        jLabel2.setText("Juan José Fernández Núñez");

        jLabel3.setText("José Manuel Fernández Vizcaíno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(282, 282, 282))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24))
        );

        Cargar.setText("Cargar");
        Cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarMouseClicked(evt);
            }
        });
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        jMenuBar1.add(Cargar);

        guardar.setText("Guardar");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jMenuBar1.add(guardar);

        jMenu3.setText("Insertar");

        BCuentaAhorro.setText("Cuenta Ahorro");
        BCuentaAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCuentaAhorroActionPerformed(evt);
            }
        });
        jMenu3.add(BCuentaAhorro);

        BCuentaCorriente.setText("Cuenta Corriente");
        BCuentaCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCuentaCorrienteActionPerformed(evt);
            }
        });
        jMenu3.add(BCuentaCorriente);

        BCuentaInversion.setText("Cuenta Inversión");
        BCuentaInversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCuentaInversionActionPerformed(evt);
            }
        });
        jMenu3.add(BCuentaInversion);

        jMenuBar1.add(jMenu3);

        Visualizar.setText("Visualizar");
        Visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisualizarMouseClicked(evt);
            }
        });
        Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarActionPerformed(evt);
            }
        });

        verDatos.setText("Ver Datos");
        verDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosActionPerformed(evt);
            }
        });
        Visualizar.add(verDatos);

        verLista.setText("Ver Lista");
        verLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verListaMouseClicked(evt);
            }
        });
        verLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaActionPerformed(evt);
            }
        });
        Visualizar.add(verLista);

        jMenuBar1.add(Visualizar);

        Ordenar.setText("Ordenar");
        Ordenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdenarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Ordenar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarMouseClicked

    }//GEN-LAST:event_VisualizarMouseClicked

    private void BCuentaAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCuentaAhorroActionPerformed
        CAhorro ahorro = new CAhorro(this.getLista());
        actualizarPanel(ahorro);
    }//GEN-LAST:event_BCuentaAhorroActionPerformed

    private void BCuentaCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCuentaCorrienteActionPerformed
        CCorriente corriente = new CCorriente(this.getLista());
        actualizarPanel(corriente);
    }//GEN-LAST:event_BCuentaCorrienteActionPerformed

    private void BCuentaInversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCuentaInversionActionPerformed
        CInversion inversion = new CInversion(this.getLista());
        actualizarPanel(inversion);
    }//GEN-LAST:event_BCuentaInversionActionPerformed

    private void VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarActionPerformed

    }//GEN-LAST:event_VisualizarActionPerformed
 
    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed

    }//GEN-LAST:event_CargarActionPerformed

    private void CargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMouseClicked
        BarraProgreso barra = new BarraProgreso();
        actualizarPanel(barra);
         boolean continuar = true;
        try {
            
           
            File f = new File("datosLista.dat");
            FileInputStream fl = new FileInputStream("datosLista.dat");
            ObjectInputStream entrada = new ObjectInputStream(fl);
            while(continuar){
                
                    this.getLista().insertar((Nodo)entrada.readObject());
                
                
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            barra.setVisible(false);
            JOptionPane.showMessageDialog(BCuentaCorriente, "No se ha encontrador el fichero");
        } catch(ClassNotFoundException ex){
            barra.setVisible(false);
            JOptionPane.showMessageDialog(BCuentaCorriente, "Error con la clase");
        } catch(EOFException ex){
            barra.setVisible(false);
           continuar = false;
        } catch(IOException ex){
            barra.setVisible(false);
            JOptionPane.showMessageDialog(BCuentaCorriente, "Error con el archivo");
        }
    }//GEN-LAST:event_CargarMouseClicked

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
    
      
    }//GEN-LAST:event_guardarActionPerformed

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
         try {
             FileOutputStream fl = new FileOutputStream("datosLista.dat");
             
            ObjectOutputStream salida = new ObjectOutputStream(fl);
            for(int i = 0;i < this.getLista().getSize()-1;i++){
                this.getLista().setPosicion(0);
                if(this.getLista().getNodo(i) == null){
                    break;
                }
                else{
                salida.writeObject(this.getLista().getNodo(i));
                }
               
            }
            salida.close();
         } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(BCuentaCorriente, "No se ha encontrador el fichero");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(BCuentaCorriente, "Error con el archivo");
        }
        
    }//GEN-LAST:event_guardarMouseClicked

    private void verDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosActionPerformed
        Visualizar visual = new Visualizar(this.getLista());
        actualizarPanel(visual);
    }//GEN-LAST:event_verDatosActionPerformed

    private void verListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaActionPerformed
        JList list = new JList(this.getLista());
        actualizarPanel(list);
    }//GEN-LAST:event_verListaActionPerformed

    private void verListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verListaMouseClicked

    }//GEN-LAST:event_verListaMouseClicked

    private void OrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenarMouseClicked
       
        Ordenar orden = new Ordenar(this.getLista());
        actualizarPanel(orden);
        
        orden.setEnabled(false);
    }//GEN-LAST:event_OrdenarMouseClicked

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BCuentaAhorro;
    private javax.swing.JMenuItem BCuentaCorriente;
    private javax.swing.JMenuItem BCuentaInversion;
    private javax.swing.JMenu Cargar;
    private javax.swing.JMenu Ordenar;
    private javax.swing.JMenu Visualizar;
    private javax.swing.JMenu guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem verDatos;
    private javax.swing.JMenuItem verLista;
    // End of variables declaration//GEN-END:variables
}
