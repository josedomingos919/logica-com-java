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
public class EstruturaDeMultiplaEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha uma opcao");
        
        System.out.println("1 - cadastrar aluno");
        System.out.println("2 - cadastrar turma");
        System.out.println("3 - cadastrar salas");
      
        int numero = entrada.nextInt();
        
        switch(numero) {
            case 1:
                System.out.println("criar aluno selecionado");
                break;
            case 2:
                System.out.println("criar turma selecionado");
                break;
            case 3:
                System.out.println("criar salas selecionado");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
    }
    
}
