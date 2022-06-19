package newpackage;

import javax.swing.JOptionPane;
public class Fila {
 public static void main(String[] args){

 //Declarando variavel
 int idade; /*fila comum menor que 59 anos, fila prioritaria de 60 a 79 anos, filaespecial 80anos ou mais*/

 //Entrada de dados com conversão junta
 JOptionPane.showMessageDialog(null,"Este programa ira encaminhar você para uma fila deespera ");
 idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade"));

 //Processamento e saida
 if (idade<=59){
 JOptionPane.showMessageDialog(null,"Você se encaixa na categoria: Fila comum");

 }else {
 if (idade>=60&&idade <=79){
 JOptionPane.showMessageDialog(null,"Você se encaixa na categoria: Fila prioritária");

 }else {
 if (idade>=80){
 JOptionPane.showMessageDialog(null,"Você se encaixa na categoria: Fila especial");
    } 
   }
  }
}
}
/*Nota: Professora, quebrei a cabeça por causa da mudança do JOptionPane, acabou virando
uma sopa de letrinhas
por causa da conversão, mas consegui resolver. Outra coisa foi esse ee (&&), foi dificil lembrar
dele para separar a idade*/




