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
public class array_nombre_edad_orden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        String a_nombres[]= new String[5];
        int a_edad[]= new int[5];
        
        for (int i = 0 ; i < a_edad.length; i++)
        {
            
            do {   
            System.out.print("Ingrese edad la "+i+"° persona: ");           
            a_edad[i]= teclado.nextInt();
           
            if (a_edad[i]<0)
            {
                System.out.println("Edad no permitida reingre los datos\n");                        
            }
                      
           } while (a_edad[i]<0);

            System.out.print("Ingrese nombre la "+i+"° persona: ");
            a_nombres[i]= teclado.next();
        }
        
        System.out.println("\nLas personas mayores de edad son: \n");
        
        for (int i=0 ; i< a_edad.length; i++)
        {
            if(a_edad[i]>= 18)
            {
                System.out.println(a_nombres[i]+ " con "+a_edad[i]+ " años" );
            }
        }
        
        
        
        
        
        
        
        
    }
    
}
