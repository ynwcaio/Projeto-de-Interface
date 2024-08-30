
package Model;

import View.Menu_GUI;
import javax.swing.JOptionPane;


public class Verifica_DAO {
    
    public static void Login(){
        //Para verificar o Login
        
        String log = View.Login_GUI.login_txt.getText();
        log = log.toLowerCase();
        
        //Verificar senha
        
        String sen = View.Login_GUI.sen_txt.getText();
        sen = sen.toLowerCase();
        
        //Define o login
        
        if(log.equals("caio") && sen.equals("1234")){
            
            JOptionPane.showMessageDialog(null, "Seja Bem-Vindo(a) " + log + "!");
          new Menu_GUI().setVisible(true);
            
    }else{
            
            JOptionPane.showMessageDialog(null, "Senha ou Logins Inválidos \n Tente Novamente");
    
}
}
}
