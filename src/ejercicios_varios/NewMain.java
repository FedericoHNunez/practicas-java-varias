
package a;

import java.util.Scanner;

public class NewMain {


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
