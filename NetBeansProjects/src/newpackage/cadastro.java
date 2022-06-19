package newpackage;


import javax.swing.JOptionPane;

public class cadastro {
    public static void main(String[] args){
        //variavel
        
        int opcao, submenu;
        

    opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opcao desejada:" + 
            "\n1 - Cadastrar usuario" + 
            "\n2 - Alterar dados" + 
            "\n3 - Excluir usuario"));   
    
    switch(opcao){
        case 1:
            JOptionPane.showMessageDialog(null,"Cadastrando usuario ");
        break;
        case 2:
    submenu = Integer.parseInt(JOptionPane.showInputDialog(
            "Menu de alteracao de dados" + 
            "\nSelecione a opcao desejada:" +
            "\n1 - Alterar nome" + 
            "\n2 - Alterar endereço" +
            "\n3 - Alterar telefone" +
            "\n4 - alterar RG"));
    switch(submenu){
        case 1:
            JOptionPane.showMessageDialog(null,"Alterar nome selecionado ");
            break;
        case 2:
            JOptionPane.showMessageDialog(null,"Alterar endereco selecionado ");
            break;
        case 3:
            JOptionPane.showMessageDialog(null,"Alterar telefone selecionado ");
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Alterar RG selecionado ");
            break;
        default:
            JOptionPane.showMessageDialog(null,"opcao invalida ");
            break;
        
    }
        
         } 
    }
}
