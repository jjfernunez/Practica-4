package Vista;

import Controlador.*;
import Modelo.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JList extends javax.swing.JPanel {
    
    public JList(Lista <Cuenta> lista) {
        initComponents();
        
        String[] ncuentas = new String[lista.getVector().length];
        
        for(int i = 0; lista.getVector()[i]!=null && i<lista.getVector().length;i++){
            
            Cuenta aux = (Cuenta) lista.getVector()[i].getDatos();
            String dat = (Integer.toString(aux.getNumero())+", "+aux.getTitular()+", "+Float.toString(aux.getSaldo()));
            
            if(aux.getClass() == CuentaAhorro.class){
                dat+=("(Cuenta ahorro)");
            }else if(aux.getClass() == CuentaInversion.class){
                dat+=("(Cuenta inversion)");
            }else{
                dat+=("(Cuenta corriente)");
            }
            ncuentas[i]=dat;
        }
        jList1.setListData(ncuentas);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        titulo = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        titulo.setFont(new java.awt.Font("Gentium Book Basic", 1, 24)); // NOI18N
        titulo.setText("LISTADO CUENTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(titulo)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
