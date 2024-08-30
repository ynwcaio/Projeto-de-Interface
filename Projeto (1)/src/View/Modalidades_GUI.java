
package View;


public class Modalidades_GUI extends javax.swing.JFrame {

    
    public Modalidades_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bola-de-basquete.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 30, 80, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bola-de-volei.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 200, 64, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/raquete-de-tenis.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(450, 20, 64, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/variante-de-bola-de-futebol.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 190, 64, 80);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FUTEBOL");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(520, 230, 120, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BASQUETE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 50, 120, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("VOLÊI");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 220, 120, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TÊNIS");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(520, 50, 120, 30);

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(253, 283, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 340);

        setSize(new java.awt.Dimension(675, 335));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new Menu_GUI().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Modalidades_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modalidades_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modalidades_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modalidades_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modalidades_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
