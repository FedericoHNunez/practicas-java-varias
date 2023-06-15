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
public class swith {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado= new Scanner(System.in);
        char camino;
        
        
        System.out.println(" ingrese camino: ");
        camino = teclado.next().charAt(0);
        
    
        System.out.println(" El camino elegido es: ");
        
        
        switch (camino){
            case 'a': 
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            default:
                System.out.println(" Soquete ");
                break;
                   
            
            
            
        }
    
        
        
        
        
        
        
    }
    
}
