package newpackage;


import javax.swing.JOptionPane;

public class Produtos {
   public static void main (String [] args) {
       //variavel
       int opcao;
       
     //entrada e conversao de dados  
    opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com o codigo do produto"));
    //processamento
    switch(opcao){
        case 100:
           JOptionPane.showMessageDialog(null,"O produto selecionado é lapis n'2 ");
        break;
        case 150:
           JOptionPane.showMessageDialog(null,"O produto selecionado é Borracha Branca "); 
        break;
        case 200:
            JOptionPane.showMessageDialog(null,"O produto selecionado é Caneta Azul ");
        break;
        case 230:
            JOptionPane.showMessageDialog(null,"O produto selecionado é Caneta Vermelha");
        break;
        case 256:
            JOptionPane.showMessageDialog(null,"O produto selecionado é Giz de Cera 12und. ");
        break;
        case 300:
            JOptionPane.showMessageDialog(null,"O produto selecionado é Cartolina Branca ");
        break;
        case 310:
            JOptionPane.showMessageDialog(null,"O produto selecionado é Resma de Sulfite A4 ");
        break;
        case 400:
            JOptionPane.showMessageDialog(null,"O produto selecionado é Estojo escolar ");
        break;
        case 470:
            JOptionPane.showMessageDialog(null,"O produto selecionado é Caderno Universitario 100fls. ");
        break;
        case 500:
            JOptionPane.showMessageDialog(null,"O produto selecionado é Caderno Brochura 50fls. ");
        break;
        
        default:
            JOptionPane.showMessageDialog(null,"Produto não cadastrado");
            break;
            
    }       
   } 
}
