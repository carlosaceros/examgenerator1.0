package vistas;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Lozano Carvajal
 */
public class preguntaVista2 extends javax.swing.JFrame {

    static String r1;
    static String r2;
    static String r3;
    static String r4;
    
    /**
     * Creates new form preguntaVista2
     */
    public preguntaVista2() {
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

        preguntaTexto = new javax.swing.JTextField();
        agregarBoton = new javax.swing.JButton();
        mensajeEtiqueta = new javax.swing.JLabel();
        respuesta1 = new javax.swing.JTextField();
        respuesta2 = new javax.swing.JTextField();
        respuesta3 = new javax.swing.JTextField();
        respuesta4 = new javax.swing.JTextField();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        homeBoton = new javax.swing.JButton();
        backBoton = new javax.swing.JButton();
        imagenFondoPregunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(preguntaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 350, 110));

        agregarBoton.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        agregarBoton.setText("Agregar");
        agregarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(agregarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        mensajeEtiqueta.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        mensajeEtiqueta.setText("Agrega la pregunta:");
        getContentPane().add(mensajeEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        respuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta1ActionPerformed(evt);
            }
        });
        getContentPane().add(respuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 220, 40));

        respuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta2ActionPerformed(evt);
            }
        });
        getContentPane().add(respuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 220, 40));

        respuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta3ActionPerformed(evt);
            }
        });
        getContentPane().add(respuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 220, 40));

        respuesta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta4ActionPerformed(evt);
            }
        });
        getContentPane().add(respuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 220, 40));

        texto1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        texto1.setText("Respuesta 1:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        texto2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        texto2.setText("Respuesta 2:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        texto3.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        texto3.setText("Respuesta 3:");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        texto4.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        texto4.setText("Respuesta 4:");
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        homeBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenHome.png"))); // NOI18N
        homeBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBotonActionPerformed(evt);
            }
        });
        getContentPane().add(homeBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        backBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenBack.png"))); // NOI18N
        backBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBotonActionPerformed(evt);
            }
        });
        getContentPane().add(backBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        imagenFondoPregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenPregunta.png"))); // NOI18N
        getContentPane().add(imagenFondoPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBotonActionPerformed
        // TODO add your handling code here:
        loginVista abrir = new loginVista();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBotonActionPerformed

    private void backBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBotonActionPerformed
        // TODO add your handling code here:
        preguntaVista abrir = new preguntaVista();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBotonActionPerformed

    private void agregarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBotonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Se agregó correctamente la pregunta", "¡Operación exitosa!", JOptionPane.INFORMATION_MESSAGE);
        profesorVista abrir = new profesorVista();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_agregarBotonActionPerformed

    private void respuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta1ActionPerformed
        // TODO add your handling code here:
        r1 = this.respuesta1.getText();
    }//GEN-LAST:event_respuesta1ActionPerformed

    private void respuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta2ActionPerformed
        // TODO add your handling code here:
        r2 = this.respuesta2.getText();
    }//GEN-LAST:event_respuesta2ActionPerformed

    private void respuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta3ActionPerformed
        // TODO add your handling code here:
        r3 = this.respuesta3.getText();
    }//GEN-LAST:event_respuesta3ActionPerformed

    private void respuesta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta4ActionPerformed
        // TODO add your handling code here:
        r4 = this.respuesta4.getText();
    }//GEN-LAST:event_respuesta4ActionPerformed

    public static String getR1() {
        return r1;
    }
    public static String getR2() {
        return r2;
    }
    public static String getR3() {
        return r3;
    }
    public static String getR4() {
        return r4;
    }

    
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
            java.util.logging.Logger.getLogger(preguntaVista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(preguntaVista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(preguntaVista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(preguntaVista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new preguntaVista2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBoton;
    private javax.swing.JButton backBoton;
    private javax.swing.JButton homeBoton;
    private javax.swing.JLabel imagenFondoPregunta;
    private javax.swing.JLabel mensajeEtiqueta;
    private javax.swing.JTextField preguntaTexto;
    private javax.swing.JTextField respuesta1;
    private javax.swing.JTextField respuesta2;
    private javax.swing.JTextField respuesta3;
    private javax.swing.JTextField respuesta4;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    // End of variables declaration//GEN-END:variables
}
