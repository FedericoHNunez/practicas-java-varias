
package a;

import java.util.Scanner;

public class charat {


    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
         
        char camino;
        
        System.out.print("Ingrese camino: ");
        camino = entrada.next().charAt(0);
        
        
        
        
        System.out.print("El camino elegido es: ");
        
        if (camino=='a')  
        {
            System.out.println("A");
        }
        else if (camino=='b')
        {
            System.out.println("B");               
        }
        else if (camino=='c')
        {
            System.out.println("C");               
               
                    }
        else
        {
            System.out.println("camino no encontrado");  
        } 
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
    

