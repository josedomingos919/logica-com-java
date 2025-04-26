/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.logicadeprogramacao;

/**
 *
 * @author User
 */
public class EstruturaAninhada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota = 4;
        
        if(nota >= 5) {
            System.out.print("Aprovado");
        }else if (nota >= 3 && nota < 5) {
            System.out.println("Exame");
        }else {
            System.out.println("Reprovado");
        }
    }
    
}
