
package newpackage;

import javax.swing.JOptionPane;

public class Agenda10_Matrizes {
    public static void main(String[] args) {
    
        //Variaveis
        //Usei só número 1 para facilitar na resposta
        int mat[][] = {
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1}};
        int linha,coluna;
        int soma=0;
        String exibir = "";
        
        //Processamento
        JOptionPane.showMessageDialog(null,"Soma das matrizes 10x10");
        for(linha=0; linha<10;linha++){
            for(coluna=0; coluna<10; coluna++){
                soma += mat[linha][coluna];
            }//fim do segundo for
        }//fim do primeiro for
        
        //Saida de dados
        for(linha=0; linha<10;linha++){
            for(coluna=0; coluna<10; coluna++){
                 
                exibir += mat[linha][coluna]+ "|";
                
            }//fim do segundo for
            exibir+= "\n";
        }//fim do primeiro for
        JOptionPane.showMessageDialog(null,exibir+"A soma é "+ soma);
    }//fim do main
    
}//fim da classe
