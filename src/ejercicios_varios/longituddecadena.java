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
public class longituddecadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        String cadena, cadena1;       

        System.out.println("Ingrese Cadena: ");
        cadena= teclado.nextLine();
        
        System.out.println(" ingrese cadena 2: ");        
        cadena1 = teclado.nextLine();
        
        int long_cadena= cadena.length();     //  variable.length(); calcula longitud de la cadena
        int long_cadena1= cadena1.length();
        
        if( long_cadena> long_cadena1)
        {
            System.out.println("la primer cadena es mayor");

        }
        else if (long_cadena< long_cadena1)
        {
            System.out.println("la segunda cadena es mayor");
        }
        else {
            System.out.println("las cadenas son iguales");
        }
        
        
        
        
        
        
        
    }
    
}
