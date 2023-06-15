/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import com.sun.javafx.font.CharToGlyphMapper;
import java.util.Scanner;

/**
 *
 * @author fenu1
 */
public class comprobarminmayu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        char letra;
        
        System.out.print("ingrese leta: ");
        letra = teclado.next().charAt(0);
        
        if (Character.isUpperCase(letra))
            
        { 
            System.out.println("Es mayuscula");
        
        }
        if (Character.isLowerCase(letra))
        {
            System.out.println("Esta en minuscula");
        
        }
        
        int suma;
        String sumas = "";
        
        System.out.print("ingrese leta 1: ");
        char letra1 = teclado.next().charAt(0);
          
        System.out.print("ingrese leta 2: ");
        char letra2 = teclado.next().charAt(0);
        
        System.out.print("ingrese leta 3: ");
        char letra3 = teclado.next().charAt(0);      
        
        sumas = letra1 + "" + letra2 + "" + letra3;
        
        suma = letra1 + letra2 + letra3;
        
        System.out.println("la concatenacion es: " + sumas);
        System.out.println("suma es " + suma );
    }
    
}
