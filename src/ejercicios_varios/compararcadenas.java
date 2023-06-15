/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.Scanner;

/**
 *
 * @author fenu1
 */
public class compararcadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cadena:");
        String cadena = teclado.next();
        
        System.out.println("Ingrese segunda cadena: ");
        String cadena2= teclado.next();
        
         
        if (cadena.equals(cadena2))   //  .equals() para comparar cadenas
            
        { 
            System.out.println("\n***********************");
            System.out.println("Las cadenas son iguales");
            System.out.println("\n***********************");
 
         }
        else if (cadena.equalsIgnoreCase(cadena2))
        {
            System.out.println("\n***********************");
            System.out.println("Las cadenas son iguales pero diferentes en minuscula y mayuscula");
            System.out.println("\n***********************");
 
        }
       
    
    
    }
    
}
