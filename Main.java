/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jpaul
 */
public class Main {
    public static void main(String[] args) {
        banco b = new banco();
        
        
               while (true) {            
            
        
   
       
       int opcao = Integer.parseInt( JOptionPane.showInputDialog("O que voce dejesa fazer:\n"
               + "1 - Exibir\n"
               + "2 - Sacar\n"
               + "3 - depositar\n"
               + "4 - Editar\n"
               + "5 - Excluir\n"
               + "6 - Transferencia\n"
               + "7 - Adicionar conta"));
       
       
       
       
            switch(opcao) {
                
                case 1 -> b.exibir();
                case 2 -> b.sacar();
                case 3 -> b.depositar();
                case 4 -> b.editar();
                case 5 -> b.excluir();
                case 6 -> b.Transferir();
                case 7 -> b.CriarConta();
                default -> JOptionPane.showMessageDialog(null, "Tarefa invalida!");
            }
       
                
        }
            
        
        
    }

   
}

