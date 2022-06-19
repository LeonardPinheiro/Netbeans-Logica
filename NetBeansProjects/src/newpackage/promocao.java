package newpackage;

import javax.swing.JOptionPane;

public class promocao {
    public static void main(String[] args){
 
    //variaveis
    String produto;
    double preco;

    //Entrada de dados
    JOptionPane.showMessageDialog(null,"Semana de aniversário, 10 produtos com desconto.");
    
    for(int armazenar=0; armazenar<10; armazenar++){
        produto = JOptionPane.showInputDialog("Digite o nome do produto");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));

    //Processamento e saida
        preco = preco/2;

        JOptionPane.showMessageDialog(null," Produto: "+produto+". O preço fica em "+ 
                " R$: " +preco+" desconto de "+50+"%.");
        
       }JOptionPane.showMessageDialog(null,"Fim do Desconto");
    }
}
