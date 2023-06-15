/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;
class Main {
   public static void main(String[] args) {
       //no toques este código
       Monopoly monopoly = new Monopoly();
       Chess chess = new Chess();
       Battleships battleships = new Battleships();
       
       monopoly.play();
       chess.play();
       battleships.play();
   }
}

abstract class Game {
   abstract String getName();
   abstract void play();
}

class Monopoly extends Game {

   //da el nombre "Monopoly" al juego
  public String getName() {
       return "monopoly";
   }

   // el método play method debe imprimir "Buy all property."
  public void play() {
       System.out.println("Buy");
   }
}

class Chess extends Game {

   //da el nombre "Chess" al juego
   public String getName() {
   return "chess";
   }

   // el método play debe imprimir "Kill the enemy king"
   public void play() {
       System.out.println("Kill");
               
   }
}

class Battleships extends Game {

   //da el nombre "Battleships" al juego
 public  String getName() {
      return "battleships";
   }

   // el método play debe imprimir "Sink all ships"
  public void play() {
       System.out.println("Sink all ships");
   }
}