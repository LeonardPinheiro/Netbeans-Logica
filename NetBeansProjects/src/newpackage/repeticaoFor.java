package newpackage;

import javax.swing.JOptionPane;

public class repeticaoFor {
    public static void main(String[] args) {
    String aluno;
    int nota1, nota2;
    int media;
    
    
    
//processamento
for(int repeticao=0; repeticao<=30; repeticao++){
   aluno = JOptionPane.showInputDialog("Digite o nome do aluno");
   nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota do aludo"));
   nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota do aludo"));
   
   media = (nota1+nota2)/2;
   
   if(media>=7){
       JOptionPane.showMessageDialog(null,"o aluno "+ aluno+" Foi aprovado, nota: "+media);
       
   }else{
       JOptionPane.showMessageDialog(null,"O aluno: "+aluno+" tirou nota "+media+". Essa nota e considerada abaixo da media."
               + " Aluno Reprovado");
   }
    
}
        
    }
}
