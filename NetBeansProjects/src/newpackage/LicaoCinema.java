package newpackage;

import javax.swing.JOptionPane;

public class LicaoCinema {
    public static void main(String[] args) {
    
    //Declarando variaveis    
    int idade;
    String nota;
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    int lugares = 0;
    int media;
    float percPessimo;        
            
    // notas A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo.
    JOptionPane.showMessageDialog(null,"Questionário");
    
    //entrada de dados
    while(lugares<5){
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite Sua Idade"));

        nota = JOptionPane.showInputDialog("O que você achou do Filme ?"
            + "\n A - Ótimo "
            + "\n B - Bom "
            + "\n C - Regular "
            + "\n D - Ruim "
            + "\n E -  Péssimo. ");

    if(nota.equalsIgnoreCase("A")){
         nota1 +=1;
    }else{
        if(nota.equalsIgnoreCase("B")){
                
        }else{
            if(nota.equalsIgnoreCase("C")){
                 
            }else{
                if(nota.equalsIgnoreCase("D")){
                    nota2 +=idade;
                }else{
                    if(nota.equalsIgnoreCase("E")){
                        nota3 +=1;
                    }
                }
            }
        }
    }
    lugares++;
    }
    //Processamento
    media = nota2/5;
    percPessimo = nota3*100 /5;
    
    //saida de dados
     JOptionPane.showMessageDialog(null,"Fim do Questionário"
            + "\n A - Ótimo "+nota1
            + "\n B - Bom " 
            + "\n C - Regular " 
            + "\n D - Ruim: Média Idade " +media
            + "\n E - Péssimo "+percPessimo+"%");
    }
}