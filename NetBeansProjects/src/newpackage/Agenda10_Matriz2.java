package newpackage;


import java.util.Random;
import javax.swing.JOptionPane;

public class Agenda10_Matriz2 {
    public static void main(String[] args) {
        //Variaveis
        int a[][] = new int[10][10];
        int soma = 0;
        int linha,coluna;
        String exibir = " ";
        Random gerador = new Random();
        
        //Processamento
        for (linha=0; linha<10; linha++){
            for(coluna=0; coluna<10; coluna++){
            a[linha][coluna] = gerador.nextInt();
                
            }//Fim do segundo for
        }//Fim do primeiro for
        
        //Saida de dados
        for(linha=0; linha<10; linha++){
            for(coluna=0; coluna<10; coluna++){
               soma += a[linha][coluna];
                exibir+= a[linha][coluna]+"|";
                
            }//Fim do segundo for
            exibir+="\n";
        }//Fim do primeiro for
         JOptionPane.showMessageDialog(null,exibir+" A soma é "+ soma);
    }//Fim do main
}//Fim da classe
