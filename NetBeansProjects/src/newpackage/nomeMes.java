package newpackage;

import javax.swing.JOptionPane;

public class nomeMes {
    public static void main(String[] args){
        
    //Declarando variavel
int numero;
int ano;

//entrada de dados
numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número do mês "));
ano = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano "));

//Processamento
switch(numero){
    case 1:
        JOptionPane.showMessageDialog(null, "Janeiro de " + ano); 
    break;
    case 2:
        JOptionPane.showMessageDialog(null, "Fevereiro de " + ano);
    break;
    case 3:
        JOptionPane.showMessageDialog(null, "Março de " + ano);
    break;
    case 4:
        JOptionPane.showMessageDialog(null, "Abril de " + ano);
    break;
    case 5:
        JOptionPane.showMessageDialog(null, "Maio de " + ano);
    break;
    case 6:
        JOptionPane.showMessageDialog(null, "Junho de " + ano);
    break;
    case 7:
        JOptionPane.showMessageDialog(null, "Julho de " + ano);
    break;
    case 8:
        JOptionPane.showMessageDialog(null, "Agosto de " + ano); 
    break;
    case 9:
        JOptionPane.showMessageDialog(null, "Setembro de " + ano);
    break;
    case 10:
        JOptionPane.showMessageDialog(null, "Outubro de " + ano);
    break;
    case 11:
        JOptionPane.showMessageDialog(null, "Novembro de " + ano);
    break;
    case 12:
        JOptionPane.showMessageDialog(null, "Dezembro de " + ano);
    break;

    default:
        JOptionPane.showMessageDialog(null, "Mês Inválido ", "E R R O", JOptionPane.ERROR_MESSAGE);
    break;    
    

      }    
    }
    
}
