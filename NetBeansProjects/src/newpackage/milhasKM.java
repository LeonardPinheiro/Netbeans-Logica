
package newpackage;

import javax.swing.JOptionPane;

public class milhasKM {
    public static void main(String[] args){
        
//variaveis
double km, milha;


//entrada de dados
milha = Double.parseDouble(JOptionPane.showInputDialog("Entre com um numero" +
        " em milhas"));
//processamento
km = milha * 1609;

//saida de dados        
JOptionPane.showMessageDialog(null,
        "O valod de " + milha + " milhas convertidas para km é " + km + 
                "quilometos");
        
    }
    
}
