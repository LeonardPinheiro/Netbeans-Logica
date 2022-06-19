package newpackage;


import java.util.Scanner;

public class ComandoIF {
    public static void main(String[] args){
    
    //Declarando variaveis
    int idade;
    
    Scanner leitor = new Scanner(System.in);
    
    //Entrada de dados
    System.out.println("Entre com sua idade");
    
    idade = leitor.nextInt();
    
    //Decisão
    if (idade>=18) {//primeiro if 
    //comandos se a condição for verdadeira
    if (idade==18) {//segundo if
        System.out.println("igual a 18");
        
    }else {
        System.out.println("maior de 18");
    
      }//fim do segundo if
    }else {//comandos se a condição for falsa
        System.out.println("menos de idade");
        
    }// fim do primeiro if
  }   

}