package net.martinburger.sesqa.programming;
import java.util.Scanner;
public class GameHelper {
    private Scanner sc;
    City city = new City();
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
    public void input(){

    }

    public void buyStatus(){
        System.out.println("\n====BUY MENU====");
        System.out.println("City Status: "+ city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople() + " residents.");
        System.out.println("Current price per Acres: " +city.getBuyCostPerAcre());
        System.out.println("How many acres would you like to buy?");
        System.out.print("> ");
    }
    public void sellStatus(){
        System.out.println("\n====SELL MENU====");
        System.out.println("City Status: "+ city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople() + " residents.");
        System.out.println("Current price per Acres: "+city.getSellCostPerAcre());
        System.out.println("How many acres would you like to sell?");
        System.out.print("> ");
    }

    public void feedStatus(){
        System.out.println("\n====Feed MENU====");
        System.out.println("City Status: "+city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople()+" residents.");
        System.out.println("How many bushels do you wish to feed your residents?");
        System.out.print("> ");
    }

    public void plantStatus(){
        System.out.println("\n====PLANT MENU====");
        System.out.println("City Status: "+city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople()+" residents.");
        System.out.println("How many acres of land do you wish to plant with seed?");
        System.out.print("> ");
    }
}