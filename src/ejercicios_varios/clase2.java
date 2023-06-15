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
public class clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        char letra1, letra2;
        String suma = " ";
        
        System.out.print("digite el primer caracter: ");
        letra1 = sc.next().charAt(0);
        
        System.out.print("digite segundo carater: ");
        letra2= sc.next().charAt(0);
        suma += letra1 + " " + letra2;
       
        System.out.println(" la suma de las letras es: " + suma);
        
      
        
        
     


    }
    
    
    
    
}
