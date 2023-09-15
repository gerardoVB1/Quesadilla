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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("ingrese los numeros de celular");
        Scanner entrada = new Scanner(System.in);
        String Oracion = entrada.nextLine();
        
        String cadena = "66-462-71-880,(664) 973 6631,664-473-57-64,664-328-8160 ,(664)95 570 89,(66)21 02 40 39,6649103647,664 899 53 53,(664)3042220,664-7514440,62 27266011,(662)7805272,3641284215,664-839-23-17,(66)414-87-576,6645677339,6221306978,333 698 7520,(664)8216081,6647766719,(662)1053790,6225703933,664 2892482,66 43143975,6646097012,6637809908, (664)8216081,6642768587,6647685767,(66)414-87-576,66 44666998,6641528281,6627053684,(662)1836543,662251-71-34,662 16 18 228,6625875393,(662)8789468,6624255192,(622) 178 9630,66 21 76 63 48,(66) 22-51- 71-34,(66)21 02 40 39,6622047144,6624371045,(622)8409539,6629307931,664 3942040,(664) 839 23 17,6646271880,664 2249512,(664)4315536,6646273721,6649103647, (664)6817442,662 2955871,6628364751,6321851302,622 896 32-00,(680) 896 30-15,6627022237,66-217-15-935,66 25983408,6621362934,66-288-083-40,6625655793, (662)947 5546,(66)21485032,(564)8392317,664-985-1864, (66)23779306";

        // Eliminar los caracteres "()", "-" y espacios en blanco y separar por comas
        String cadenaLimpia = cadena.replaceAll("[()-]", "");

        int contador622 = 0;
        int contador662 = 0;
        int contador664 = 0;
        int contadorNoCoincidentes = 0;
        
        String[] numeros = cadenaLimpia.split(",");

        for (String numero : numeros) {
            if (numero.startsWith("622")) {
                contador622++;
            } else if (numero.startsWith("662")) {
                contador662++;
            } else if (numero.startsWith("664")) {
                contador664++;
            } else {
                contadorNoCoincidentes++;
            }
        }

        System.out.println("Número de guaymas: " + contador622);
        System.out.println("Número de hermosillo: " + contador662);
        System.out.println("Número de tijuana: " + contador664);
        System.out.println("Números de area desconocido : " + contadorNoCoincidentes);
}

        

        
        
        
        
        
        
        
        
        
        
        /*String nuevaOracion = oracion.replace("m", "s").replace("M", "s");
        System.out.println(nuevaOracion);
        
        boolean estaUsada = oracion.startsWith("a");
        if(estaUsada){
            System.out.println("si inicia con a");
        } else{
                System.out.println("no inicia con a");    
                    
                    }
        //////////////////////////
        
        if(oracion.startsWith("a")){
        System.out.println("si inicia con a");
        } else{
                System.out.println("no inicia con a");    
                     }
        //////////
        System.out.println(oracion.startsWith("a") ? "si inicia con a" : "no inicia con a");
        
        */
       
        
    }
    
    
    
    

