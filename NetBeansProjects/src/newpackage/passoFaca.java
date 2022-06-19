
package newpackage;

import javax.swing.JOptionPane;

public class passoFaca {
    public static void main(String[] args){
        int numero;
      
        
     JOptionPane.showMessageDialog(null,"Contando ate 10");
        
        
        for(numero=0; numero<10; numero+=1){
            JOptionPane.showMessageDialog(null,"O numero é "+numero);
        
        }
        
       JOptionPane.showMessageDialog(null,"Fora do laço");
        
    }
    
}
