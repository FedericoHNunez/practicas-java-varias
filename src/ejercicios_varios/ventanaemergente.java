/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author fenu1
 */
public class ventanaemergente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
    Scanner entrada = new Scanner(System.in);
    
    //creamos variables
    float numero;
    double numero_decimal;
    float numero_decima2;
    String cadena;
    char caracter;
    
  
    
    
    //aplicamos ventanas
    
    /*
    la funcion "Joptionpane.showImputDialog" corresoponde a una funcion de cadena por lo que al ingresar numeros 
    hay que pasar los valor por eso se pone
    integer.parseInt para enteros
    float.ParseFloat para flotantes simples
    double.ParseDouble para flotantes dobles
    no asi con cadenas que se llama a la fucion directamente
    
   JoptionPane.ShowDialog ()
    
    */
        numero =           Float.parseFloat(JOptionPane.showInputDialog(" ingrese un numero entero: "));
       
        while (0 != numero- Math.floor(numero))
        {
            JOptionPane.showMessageDialog(null," no es entero", "ERROR",JOptionPane.INFORMATION_MESSAGE);
            numero =           Integer.parseInt(JOptionPane.showInputDialog(" ingrese un numero entero: "));
            
        }
        
        
        numero_decimal=    Double.parseDouble(JOptionPane.showInputDialog(" ingrese primer numero decimal"));
        numero_decima2=    Float.parseFloat(JOptionPane.showInputDialog(" ingrese segundo numero decimal: "));
        cadena=            JOptionPane.showInputDialog(" Digite una cadena");
        caracter =         JOptionPane.showInputDialog("ingrese caracter").charAt(0);
        
    
    
    

                }    
}
