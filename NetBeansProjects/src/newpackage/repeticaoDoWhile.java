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
public class repeticaoDoWhile {
    public static void main(String[] args) {
        int num =0;
        
        do{
           JOptionPane.showMessageDialog(null,"numero: "+num);
           num++;
        }while(num<10);
    }
}
