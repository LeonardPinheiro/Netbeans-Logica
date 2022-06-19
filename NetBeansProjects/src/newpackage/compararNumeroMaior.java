
package newpackage;

import javax.swing.JOptionPane;

public class compararNumeroMaior {
    public static void main(String[] args) {
        int x =2;
        int num;
        int maior;
        int comparar;
        
        comparar = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos numeros vc quer comparar"));
        
        maior = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        
        while(x<=comparar){
            num = Integer.parseInt(JOptionPane.showInputDialog("digite" + x + "Numero"));
           
        if(num>maior){
           maior = num;
           
        }x++;
        
        }JOptionPane.showMessageDialog(null,"o maior numero digitado foi"+ maior);
        
    }
}
