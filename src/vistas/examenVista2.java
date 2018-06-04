package vistas;
import java.awt.Dimension;

/**
 *
 * @author Lozano Carvajal
 */
public class examenVista2 extends javax.swing.JFrame {

    /**
     * Creates new form examenVista
     */
    public examenVista2() {
        initComponents();
        this.setSize(new Dimension(800, 600));
        this.setMinimumSize(new Dimension(800, 600));
        setLocation(100,50);
        grupoBotones.clearSelection();
        grupoBotones.add(opcion1);
        grupoBotones.add(opcion2);
        grupoBotones.add(opcion3);
        grupoBotones.add(opcion4);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        opcion1 = new javax.swing.JRadioButton();
        opcion2 = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        opcion4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        anteriorBoton = new javax.swing.JButton();
        siguienteBoton = new javax.swing.JButton();
        imagenPDF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imagenFondoProfesor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 310, 70));

        opcion1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        opcion2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        opcion3.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(opcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        opcion4.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        getContentPane().add(opcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 48)); // NOI18N
        jLabel1.setText("¡Éxitos en su examen!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 320, 60));

        anteriorBoton.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        anteriorBoton.setText("<< Anterior");
        getContentPane().add(anteriorBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        siguienteBoton.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        siguienteBoton.setText("Siguiente >>");
        getContentPane().add(siguienteBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        imagenPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenPDF.png"))); // NOI18N
        getContentPane().add(imagenPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 120, 130));

        jButton1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        jButton1.setText("Terminar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 120, 30));

        imagenFondoProfesor.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        imagenFondoProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenFondoExamen.png"))); // NOI18N
        getContentPane().add(imagenFondoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(examenVista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examenVista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examenVista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examenVista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new examenVista2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anteriorBoton;
    private javax.swing.JTextArea areaTexto;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel imagenFondoProfesor;
    private javax.swing.JLabel imagenPDF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opcion1;
    private javax.swing.JRadioButton opcion2;
    private javax.swing.JRadioButton opcion3;
    private javax.swing.JRadioButton opcion4;
    private javax.swing.JButton siguienteBoton;
    // End of variables declaration//GEN-END:variables
}