package vistas;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import marvas.Usuario;

/**
 *
 * @author Lozano Carvajal
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.usuario = new Usuario();
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

        campoCodigo = new javax.swing.JTextField();
        nombreEtiqueta = new javax.swing.JLabel();
        codigoEtiqueta = new javax.swing.JLabel();
        entrarBoton = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();
        tipoUsuarioCombo = new javax.swing.JComboBox<>();
        imagenFondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(campoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 230, 30));

        nombreEtiqueta.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 48)); // NOI18N
        nombreEtiqueta.setText("Nombre:");
        getContentPane().add(nombreEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 120, 40));

        codigoEtiqueta.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 48)); // NOI18N
        codigoEtiqueta.setText("Código:");
        getContentPane().add(codigoEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 110, 60));

        entrarBoton.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 48)); // NOI18N
        entrarBoton.setText("Entrar");
        entrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(entrarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 150, 50));
        getContentPane().add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 230, 30));

        tipoUsuarioCombo.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 48)); // NOI18N
        tipoUsuarioCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente" }));
        getContentPane().add(tipoUsuarioCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 180, 50));

        imagenFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bkmasmejor.jpg"))); // NOI18N
        getContentPane().add(imagenFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBotonActionPerformed

        try {
            Integer.parseInt(this.campoCodigo.getText());
            if (campoNombre.getText() != "") {

                this.usuario = new Usuario(campoNombre.getText(), campoCodigo.getText(), (String) tipoUsuarioCombo.getSelectedItem());
            } else {

                JOptionPane.showMessageDialog(null, "No has ingresado nombre y/o código, por favor, vuelve a intentarlo", "¡Ha ocurrido algo!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No has ingresado nombre y/o código, por favor, vuelve a intentarlo", "¡Ha ocurrido algo!", JOptionPane.WARNING_MESSAGE);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_entrarBotonActionPerformed

    private void campoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoActionPerformed

    public Usuario getUsuario() {
        return usuario;
    }

    private Usuario usuario;

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel codigoEtiqueta;
    private javax.swing.JButton entrarBoton;
    private javax.swing.JLabel imagenFondoLogin;
    private javax.swing.JLabel nombreEtiqueta;
    private javax.swing.JComboBox<String> tipoUsuarioCombo;
    // End of variables declaration//GEN-END:variables

}
