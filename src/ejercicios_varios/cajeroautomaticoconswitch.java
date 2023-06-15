/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author fenu1
 */
public class cajeroautomaticoconswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner teclado = new Scanner (System.in);
        
        int opcion;
        float saldo_inicial= 200000;
        float saldo_actual;
        float aux;
        boolean continuar = true;
        
        do{
        
                  opcion= Integer.parseInt(JOptionPane.showInputDialog("ELIJA OPERACION \n "
                + "1:Depositar\n"
                + "2:Retirar\n"
                + "3:Consultar saldo\n"
                + "4:Salir "));
        
        
       
                    switch (opcion)
                    {
                        case 1:
                            aux= Float.parseFloat(JOptionPane.showInputDialog("Cantidad a ingresar: \n ***0 Menu anterior"));

                            if (aux == 0)
                              {
                               break;
                              }
                            
                            if (aux < 0)
                            {    
                               JOptionPane.showMessageDialog (null,"No se puede ingresar negativo" , "ERROR", JOptionPane.WARNING_MESSAGE); 
                               break;
                            }  
                               
                            if (aux >0)
                              {
                               saldo_actual = saldo_inicial  + aux;
                               saldo_inicial= saldo_actual;
                               JOptionPane.showMessageDialog(null, "su deposito fue de : "+ aux+
                                     "\n Su saldo actual es de:  "+saldo_actual, "", JOptionPane.INFORMATION_MESSAGE);
                               break;
                              }
                         



                        case 2:

                              aux= Float.parseFloat(JOptionPane.showInputDialog("ingrese cantidad a retirar: \n ***0 Menu anterior "));

                              
                              
                              if (aux > saldo_inicial)
                              {
                                  JOptionPane.showMessageDialog(null,"Saldo insuficiente", "Sos pobre", JOptionPane.WARNING_MESSAGE);
                                  break;
                              }
                              
                              if (aux == 0)
                              {
                                break;
                              }  


                              if (aux <0 )
                                 {          
                                 JOptionPane.showMessageDialog(null, "No se puede retirar negativo", "ERROR", JOptionPane.WARNING_MESSAGE);
                                
                                 break;
                                 }
                                 else
                                 {
                                 saldo_actual = saldo_inicial  - aux;
                                 saldo_inicial= saldo_actual;
                                 
                                 JOptionPane.showMessageDialog(null, "su retiro fue de : "+ aux+
                                     "\n Su saldo actual es de:  "+ saldo_actual , "", JOptionPane.INFORMATION_MESSAGE);
                                 break;

                                 }




                        case 3:            
                             JOptionPane.showMessageDialog(null,"Su saldo actual es de:  "+ saldo_inicial ,"", JOptionPane.INFORMATION_MESSAGE); 
                         break;

                        case 4:
                            continuar= false;
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null," Opcion incorrecta", "", JOptionPane.WARNING_MESSAGE);
                    }
       }
       while (continuar );
      
      System.exit(0);
       
  
        
        
        
        
    
    
    
    }
    
    
    
    
    
    
    
    
}
