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
public class exponente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        Scanner ingreso = new Scanner(System.in);
        
        int base, exponente, resultado;
        
        
       resultado = 0;        
        System.out.print("ingrese base: ");
        base = ingreso.nextInt();
        
        System.out.print("ingrese el exponente: ");
        exponente = ingreso.nextInt();
        
        resultado = (int) Math.pow(base,exponente);
        
    
        
        System.out.println("la base " + base + " por el exponente " + exponente + " es: " + resultado);
        
        
    }
    
}
