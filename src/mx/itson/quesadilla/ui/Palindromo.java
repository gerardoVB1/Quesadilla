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
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una frase
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        // Verificar si la frase es un palíndromo y mostrar el resultado
        if (esPalindromo(frase)) {
            System.out.println("Sí es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
        
        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
    
    // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String texto) {
        // Eliminamos espacios y convertimos a minúsculas para ignorar diferencias de formato
        texto = texto.replaceAll("\\s", "").toLowerCase();
        
        // Obtenemos la longitud de la cadena
        int longitud = texto.length();
        
        // Comparamos caracteres de izquierda a derecha y de derecha a izquierda
        for (int i = 0; i < longitud / 2; i++) {
            if (texto.charAt(i) != texto.charAt(longitud - 1 - i)) {
                // Si los caracteres no coinciden, la cadena no es un palíndromo
                return false;
            }
        }
        
        // Si hemos llegado a este punto, la cadena es un palíndromo
        return true;
    }
}
   
