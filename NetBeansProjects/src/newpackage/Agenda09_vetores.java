package newpackage;

import javax.swing.JOptionPane;

public class Agenda09_vetores {
    public static void main(String[] args) {
        
        int numero[] = new int[3];
        int i;
        int soma = 0;

        JOptionPane.showMessageDialog(null,"LotoCom - Sorteios");
        
        
        //Entrada de dados
        for(i=0;i<3;i++){
        numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+ "° número da sorte de 0 a 38"));
        
        //Processamento e saida
        if(numero[i] <0){
            JOptionPane.showMessageDialog(null,"Insira apenas números de 0 a 38 ");
            i--;
        }else if(numero[i]>38){
            JOptionPane.showMessageDialog(null,"Insira apenas números de 0 a 38 ");
            i--;
         }
        }for(i=0;i<3;i++){
            if(numero[i] % 4 == 0){
            soma = soma+numero[i];
      }
    }  
        JOptionPane.showMessageDialog(null,"A soma dos valores divisíveis por 4 é "+ soma);
      
        //lição complementar
        //Processamento e saida
        soma = soma/3;
        if(soma>25){
        JOptionPane.showMessageDialog(null,"Resultado: "+soma+" Você Ganhou o prêmio máximo");
        
        }else if(soma>20&&soma<25){
        JOptionPane.showMessageDialog(null,"Resultado: "+soma+" Você Ganhou o prêmio comum");
        }else{
        JOptionPane.showMessageDialog(null,"Resultado: "+soma+" Que Azar em, você não ganhou prêmio"); 
    } 
  }
}
