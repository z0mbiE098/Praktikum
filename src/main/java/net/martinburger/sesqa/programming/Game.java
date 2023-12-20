package net.martinburger.sesqa.programming;

import org.w3c.dom.Text;

public class Game {
    City c;
   TextInterface t;
   public Game(){
       this.t = new TextInterface();
   }

   public void startGame(){
       t.mainMenu();
       for (int i =0;i<= 10; i++){

       }
   }
}
