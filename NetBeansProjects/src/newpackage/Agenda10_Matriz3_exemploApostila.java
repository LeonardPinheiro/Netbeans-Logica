
package newpackage;

import javax.swing.JOptionPane;


public class Agenda10_Matriz3_exemploApostila {
    public static void main(String[] args) {
        //Variaveis
        int a[][]= new int [10][10];
        int b[][]= new int [10][10];
        int c[][]= new int [10][10];
        int linha;
        int coluna;
        int soma=0;
        String exibir="";
        
        //Processamento
        for(linha=0; linha<10; linha++){
            for(coluna=0; coluna<10; coluna++){
              a[linha][coluna] = linha*coluna; 
            }//Fim do segundo for
        }//Fim do primeiro for
        for(linha=0; linha<10; linha++){
            for(coluna=0; coluna<10; coluna++){
                b[linha][coluna] = linha*coluna;
            }//Fim do segundo for
        }//Fim do primeiro for
        //Saida de dados
        for(linha=0; linha<10; linha++){
            for(coluna=0; coluna<10; coluna++){
                c[linha][coluna] = a[linha][coluna]+b[linha][coluna];
                soma = soma +c[linha][coluna];
                exibir +=c[linha][coluna]+"|";
                
            }//Fim do segundo for
            exibir+="\n";
        }//Fim do primeiro for
        JOptionPane.showMessageDialog(null," "+exibir+"soma "+ soma);
    }//Fim do main
}//Fim da classe
