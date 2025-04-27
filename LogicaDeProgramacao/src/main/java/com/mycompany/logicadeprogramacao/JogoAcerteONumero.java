
package com.mycompany.logicadeprogramacao;

import java.util.Scanner;
import java.util.Random;

public class JogoAcerteONumero {

    public static void main(String[] args) {
        Random gerador = new Random();
        
        // gerar numeros de 0 a 100
        int x = gerador.nextInt(100);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivinhe o numero que estou pensando ?");
        
        int numero = entrada.nextInt();
        
        if(numero == x) {
            System.out.println("Parabens voce acertou em pensei no " + x);
        } else {
            System.out.println("Voce errou, eu pensei no "+x);
        }
        
    }
    
}
