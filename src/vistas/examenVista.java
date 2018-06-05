/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;

/**
 *
 * @author Lozano Carvajal
 */
public class examenVista extends javax.swing.JFrame {

    /**
     * Creates new form examenVista
     */
    public examenVista() {
        initComponents();
        this.setSize(new Dimension(800, 600));
        this.setMinimumSize(new Dimension(800, 600));
        setLocation(100,50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensajeEtiqueta = new javax.swing.JLabel();
        comboExamen = new javax.swing.JComboBox<>();
        presentarBoton = new javax.swing.JButton();
        saludoEtiqueta = new javax.swing.JLabel();
        homeBoton = new javax.swing.JButton();
        imagenFondoExamen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeEtiqueta.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        mensajeEtiqueta.setText("Seleccione el examen que va a presentar:");
        getContentPane().add(mensajeEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        comboExamen.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        comboExamen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        presentarBoton.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        presentarBoton.setText("Presentar examen...");
        getContentPane().add(presentarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        saludoEtiqueta.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 70)); // NOI18N
        saludoEtiqueta.setText("¡Bienvenido Estudiante!");
        getContentPane().add(saludoEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        homeBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenHome.png"))); // NOI18N
        homeBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBotonActionPerformed(evt);
            }
        });
        getContentPane().add(homeBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        imagenFondoExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenFondoExamen.png"))); // NOI18N
        imagenFondoExamen.setText("jLabel1");
        getContentPane().add(imagenFondoExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBotonActionPerformed
        // TODO add your handling code here:
        loginVista abrir = new loginVista();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBotonActionPerformed

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
            java.util.logging.Logger.getLogger(examenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new examenVista().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboExamen;
    private javax.swing.JButton homeBoton;
    private javax.swing.JLabel imagenFondoExamen;
    private javax.swing.JLabel mensajeEtiqueta;
    private javax.swing.JButton presentarBoton;
    private javax.swing.JLabel saludoEtiqueta;
    // End of variables declaration//GEN-END:variables
}
