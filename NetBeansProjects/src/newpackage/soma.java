
package newpackage;

import javax.swing.JOptionPane;

public class soma {
    public static void main(String[] args){
        
    //variaveis
double num1, num2, resultado;
int operacao;

//entrada de dados
        
num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o primeiro numero"));
num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o segundo numero"));        
 
operacao = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite a operacao desejada:" + 
        "\n1 - soma" +
        "\n2 - subtracao" + 
        "\n3 - multiplicacao" +
        "\n4 - divisao" +
        "\n5 - resto da divisao"));
//processamento
switch(operacao){
    case 1: //soma
        resultado = num1 + num2;
    break;  
    case 2: //subtracao
        resultado = num1 - num2;
    break;
    case 3: //multiplicacao
        resultado = num1 * num2;
    break;
    case 4: // divisao
        resultado = num1 / num2;
    break;
    case 5: //resto da divisao
        resultado = num1 % num2;
    break;
    
    default:
        resultado = 0;
    break;
    
    
    
}
//saida de dados
JOptionPane.showMessageDialog(null,"O resultado da operacao é " + resultado);

    }
    
}
