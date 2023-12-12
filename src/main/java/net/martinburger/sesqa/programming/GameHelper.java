package net.martinburger.sesqa.programming;
import java.util.Scanner;
public class GameHelper {
    private Scanner sc;
    public GameHelper(){
        sc = new Scanner(System.in);
    }

    public int getUserInput(){
        int userInput;
        while(true){
            try{
               userInput = sc.nextInt();
               break;
            } catch(java.util.InputMismatchException e) {
                System.out.println("Please select from the given options: ");
                sc.nextLine();
            }
        }
        return userInput;
    }
}