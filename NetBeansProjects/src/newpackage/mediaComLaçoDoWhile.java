/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class mediaComLaçoDoWhile {
    public static void main(String[] args) {
        int num = 0;
        float media = 0;
        int contador = 0;
        
        do{
        num = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        media = media+num;
        contador++;
        
        }while(contador<5);
        media = media/5;
        JOptionPane.showMessageDialog(null,"a media é" +media);
    }
}
