/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JComponent;
/**
 *
 * @author fenu1
 */
public class ejercicio10_con_ventanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner teclado= new Scanner (System.in);
        
       
        JOptionPane.showMessageDialog(null, "Programa de maxi","ejercicio 10", JOptionPane.INFORMATION_MESSAGE);
        
     // declaracion de variables
     
        double base, altura, area;
        
        
     //bloque de ingreso de datos correctos
        
        //ingreso de base
     
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base"));
        
      
        if (base == 0) 
        {
            System.out.println("");
             JOptionPane.showMessageDialog(null," CERRANDO PROGRAMA", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
 
     
        while( base < 0 || base - Math.floor (base)!=0)                
            {                
               
                
                
                
                
               if ( base <0) 
                 {   
                 
                     JOptionPane.showMessageDialog(null, "NO DE PUEDEN INGRESAR NUMEROS NEGATIVOS","ERROR", JOptionPane.ERROR_MESSAGE);
                     //System.out.println("No se pueden ingresar numeros negativos");             
                 }
               
                if ( base - Math.floor (base)!=0) 
                     {            
                   
                         JOptionPane.showMessageDialog(null,"INGRESAR SOLO NUMEROS POSITIVOS","ERROR", JOptionPane.ERROR_MESSAGE);                     
                         //System.out.println("Ingresar solo numeros enteros");
                     }   
                System.out.println("");
                base= Double.parseDouble(JOptionPane.showInputDialog("ingrese la base"));
                
                
                
                
                //System.out.print("ingresar base: ");  
               // base = teclado.nextDouble();
               
            }   
            
        
        
        
     //ingreso de altura
        
         //System.out.println("");                                 
         //System.out.print("ingresar altura: ");
         //altura = teclado.nextDouble();     
         
        altura= Double.parseDouble(JOptionPane.showInputDialog("ingresar la altura"));
         
        if ( altura == 0) 
        {      
           JOptionPane.showMessageDialog(null,"CERRANDO PROGRAMA", "ERROR",JOptionPane.ERROR_MESSAGE);
            
             //System.out.println("");
            //System.out.println("cerrando programa");     
                                
            System.exit(0);
        }

         
        while (altura < 0 || altura - Math.floor (altura)!=0 )
        {              
 
            if ( altura <0)
             {

            JOptionPane.showMessageDialog(null,"No se pueden ingresar numero negativos", "error", JOptionPane.ERROR_MESSAGE);
            //System.out.println("No se pueden ingresar numeros negativos");
             }
            
            if ( altura - Math.floor (altura) !=0 )
             {  
                 JOptionPane.showMessageDialog(null, "INGRESAR SOLO NUMEROS ENTEROS","ERROR", JOptionPane.ERROR_MESSAGE) ;
                // System.out.println("Ingresar solo numeros enteros"); 
             }
               
            System.out.println("");
            
            altura= Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura"));
            
            
           // System.out.print("ingresar altura: ");
           //altura = teclado.nextDouble();
        }
        
        
        
        
        
        
    // bloque de comprovacion de datos  
      
        
        if ( altura == base)
        {
            JOptionPane.showMessageDialog(null,"Este programa no calcula el area de un cuadrado... \n                            sopenco", "ERROR", JOptionPane.ERROR_MESSAGE);
           // System.out.println(""); 
            //System.out.println("Este programa no calcula el area de un cuadrado...sopenco");            
            System.exit(0);
        }
                

        
      
    //operacion final
        
        area = base * altura;    
          
        
        JOptionPane.showMessageDialog(null,"la superficie del rectangulo es " + area,"RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        
         //System.out.println("");      
         //System.out.println("La base ingresada fue: " + base + "\nLa altura ingresada fue: " + altura + "\nEl area del rectangulo es: " + area);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

    
    

