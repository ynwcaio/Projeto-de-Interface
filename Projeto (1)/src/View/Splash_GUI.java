
package View;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Splash_GUI extends javax.swing.JFrame {

    
    public Splash_GUI() {
        initComponents();
        
        //>Inicio do Splash
        
        new Thread(){
        
            public void run() {
        
        
        for (int i=0; i<101; i++){
                    try {
                        sleep(60); 
                        
                        barra.setValue(i);
                        
                        if(barra.getValue() == 10){
                        
                            mess_txt.setText("Fazendo a conexao com o banco de dados");
                            sleep(2000);
                                                       
                        
                        }else if (barra.getValue() <=30){
                            mess_txt.setText("Carregando o sistema");
                          sleep(100);  
                        } else if (barra.getValue() <=99){
                            mess_txt.setText("Carregamento quase completo");
                            
                        }else{
                            mess_txt.setText("Carregamento completo. Seu programa sera iniciado.");
                        
                        sleep(3000);
                        
                        new Login_GUI().setVisible(true);
                        dispose();
                        }
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Login_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
        
        
        }        
        }
        
        }.start();
        
        
        
        
        
        
        //> Final do Splash
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        mess_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arbitro-de-futebol (1).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 120, 220, 200);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Central Do Apito");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 20, 420, 58);

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.setForeground(new java.awt.Color(51, 255, 0));
        barra.setStringPainted(true);
        jPanel1.add(barra);
        barra.setBounds(240, 360, 290, 30);

        mess_txt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        mess_txt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mess_txt);
        mess_txt.setBounds(230, 410, 390, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 540);

        setSize(new java.awt.Dimension(927, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mess_txt;
    // End of variables declaration//GEN-END:variables
}
