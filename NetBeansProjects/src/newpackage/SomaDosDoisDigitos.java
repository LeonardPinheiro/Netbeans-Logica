package newpackage;

import javax.swing.JOptionPane;

public class SomaDosDoisDigitos {
    public static void main(String[] args) {
        int num, soma;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero inteiro"));
        soma = (num % 10);
        
        while(num>0){
            num /= 10;
            soma = soma+(num % 10);
            
            JOptionPane.showMessageDialog(null, soma);
        }
    }
}
