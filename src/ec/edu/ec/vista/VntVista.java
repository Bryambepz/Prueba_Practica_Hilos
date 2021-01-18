/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.vista;

import ec.edu.ec.controlador.ControladorClientes;
import ec.edu.ec.modelo.Clientes;
import javax.swing.JLabel;

/**
 *
 * @author braya
 */
public class VntVista extends javax.swing.JFrame {

    private JLabel[] ventanillas;
    private JLabel[] clientes;
    private ControladorClientes ctrlClientes;

    /**
     * Creates new form VntVista
     */
    public VntVista() {
        initComponents();
        ctrlClientes = new ControladorClientes();
        ventanillas = new JLabel[3];
        ventanillas[0] = ventanilla1;
        ventanillas[1] = ventanilla2;
        ventanillas[2] = ventanilla3;
        clientes = new JLabel[10];
        clientes[0] = cliente1;
        clientes[1] = cliente2;
        clientes[2] = cliente3;
        clientes[3] = cliente4;
        clientes[4] = cliente5;
        clientes[5] = cliente6;
        clientes[6] = cliente7;
        cliente5.setLocation(759, 610);
        clientes[7] = cliente8;
        cliente6.setLocation(759, 694);
        clientes[8] = cliente9;
        clientes[9] = cliente10;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanilla1 = new javax.swing.JLabel();
        ventanilla2 = new javax.swing.JLabel();
        ventanilla3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnEmpezar = new javax.swing.JButton();
        cliente1 = new javax.swing.JLabel();
        cliente2 = new javax.swing.JLabel();
        cliente3 = new javax.swing.JLabel();
        cliente4 = new javax.swing.JLabel();
        cliente5 = new javax.swing.JLabel();
        cliente6 = new javax.swing.JLabel();
        cliente7 = new javax.swing.JLabel();
        cliente8 = new javax.swing.JLabel();
        cliente9 = new javax.swing.JLabel();
        cliente10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaProgreso = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(270, 100));
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        ventanilla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/270.jpg"))); // NOI18N

        ventanilla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/270.jpg"))); // NOI18N

        ventanilla3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/270.jpg"))); // NOI18N

        btnEmpezar.setText("EMPEZAR");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        cliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        cliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        cliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        cliente4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        cliente5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        cliente6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        cliente7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        cliente8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        cliente9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        cliente10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ec/Imagenes/andando-y-caminando-imagen-animada-0047 (1).gif"))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Progreso"));

        areaProgreso.setColumns(20);
        areaProgreso.setRows(5);
        jScrollPane1.setViewportView(areaProgreso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(ventanilla1)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ventanilla2)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ventanilla3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(cliente1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(cliente2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(cliente3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(cliente4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(cliente5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(cliente8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(cliente9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(cliente10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnEmpezar)
                        .addGap(606, 606, 606)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cliente6)
                            .addComponent(cliente7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ventanilla1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ventanilla2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ventanilla3))
                        .addGap(15, 15, 15)
                        .addComponent(cliente1)
                        .addGap(6, 6, 6)
                        .addComponent(cliente2)
                        .addGap(6, 6, 6)
                        .addComponent(cliente3)
                        .addGap(6, 6, 6)
                        .addComponent(cliente4)
                        .addGap(6, 6, 6)
                        .addComponent(cliente5)
                        .addGap(6, 6, 6)
                        .addComponent(cliente6)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnEmpezar))
                            .addComponent(cliente7))
                        .addGap(6, 6, 6)
                        .addComponent(cliente8)
                        .addGap(6, 6, 6)
                        .addComponent(cliente9)
                        .addGap(6, 6, 6)
                        .addComponent(cliente10)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void crearClientes() {

    }

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < 10; i++) {
            JLabel cliente = clientes[i];
            cliente.setName("Cliente #" + (i+1));
//            System.out.println(cliente.getX() + " ; " + cliente.getY());
        }
        ctrlClientes = new ControladorClientes(clientes, ventanillas, areaProgreso);
        
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(VntVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VntVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VntVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VntVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VntVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaProgreso;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JLabel cliente1;
    private javax.swing.JLabel cliente10;
    private javax.swing.JLabel cliente2;
    private javax.swing.JLabel cliente3;
    private javax.swing.JLabel cliente4;
    private javax.swing.JLabel cliente5;
    private javax.swing.JLabel cliente6;
    private javax.swing.JLabel cliente7;
    private javax.swing.JLabel cliente8;
    private javax.swing.JLabel cliente9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel ventanilla1;
    private javax.swing.JLabel ventanilla2;
    private javax.swing.JLabel ventanilla3;
    // End of variables declaration//GEN-END:variables
}
