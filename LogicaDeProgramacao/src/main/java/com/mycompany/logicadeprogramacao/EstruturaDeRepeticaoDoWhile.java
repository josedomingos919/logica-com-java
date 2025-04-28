/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.logicadeprogramacao;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EstruturaDeRepeticaoDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("Digite um valor ou 99 para sair");
            opcao = entrada.nextInt();
        } while(opcao != 99);
    }
    
}
