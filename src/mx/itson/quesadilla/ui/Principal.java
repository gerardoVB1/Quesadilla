/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("ingrese texto a evaluar");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
       
        System.out.println(oracion.trim().toUpperCase());
        
       /* char[] arrayChar = oracion.toCharArray();
        for(char a : arrayChar){
            System.out.println(a);
        }*/
        
    }
    
}
