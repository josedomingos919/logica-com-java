/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.logicadeprogramacao;

/**
 *
 * @author User
 */
public class EstruturaDeRepeticaoAninhada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        
        while (i<=10){
            int j = 0;
            
            do {
                System.out.println(i + " x " + j + " = " + (j*i));
                
                j++;
            } while(j != 10);
            
            System.out.println("*******************************************");
            
            i++;
        }
    }
    
}
