/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logicadeprogramacao;
import java.util.Scanner;
/**
 *
 * @author User
 */

// Nao clica no play clica no ficheiro e escolha em roda
public class Entrada_e_Saida {

    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        System.out.print("Informe seu nome: ");
        
        Scanner entrada = new Scanner(System.in);
        String palavra;
        palavra = entrada.nextLine();
        System.out.println("Palavra: " + palavra );
    }
}
