package net.martinburger.sesqa.programming;

import net.martinburger.sesqa.programming.City;

import java.util.Scanner;

public class TextInterface {
    Scanner sc = new Scanner(System.in);
    City city = new City();
    GameHelper gh = new GameHelper();

    public boolean mainMenu() {
        System.out.println("==== MAIN MENU ====");
        System.out.println("1. NEW GAME\n2. QUIT");
        System.out.println("Please select an option");
        int eingabe = gh.getUserInput();
        switch (eingabe) {
            case 1:
                gameMenu();
                break;
            case 2:
                System.out.println("Thank you for playing Codeopolis");
                System.exit(0);
                break;
            default:
                System.out.println("Please select the available options: ");
                mainMenu();
        }
        return true;
    }

    public void gameMenu() {
        System.out.println("\n==== GAME MENU ====");
        System.out.println("1. BUY\n2. SELL\n3. FEED\n4. PLANT\n5. SHOW STATUS\n6. QUIT GAME");
        System.out.println("Please select an action");
        int eingabe = gh.getUserInput();
        switch (eingabe) {
            case 1: buyMenu(); break;
            case 2: sellMenu(); break;
            case 3: feedMenu(); break;
            case 4: plantMenu(); break;
            case 5:
                city.tostring();
                break;
            case 6:
                mainMenu();
                break;
            default:
                System.out.println("Please select the available options: ");
                gameMenu();
        }
    }

    public
    void buyMenu(){
        System.out.println("\n====BUY MENU====");
        System.out.println("City Status: "+ city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople() + " residents.");
        System.out.println("Current price per Acres: " +city.getBuyCostPerAcre());
       int eingabe;
        do {
            System.out.println("How many acres would you like to buy?");
            System.out.print("> ");
            eingabe = gh.getUserInput();
        } while (!city.buy(eingabe));
        System.out.println("You bought "+eingabe+" acres.");
  //      System.out.println("New Status: " +city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople()+" residents");
        sellMenu();
    }

    public void sellMenu(){
        System.out.println("\n====SELL MENU====");
        System.out.println("City Status: "+ city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople() + " residents.");
        System.out.println("Current price per Acres: "+city.getSellCostPerAcre());
        System.out.println("How many acres would you like to sell?");
        System.out.print("> ");
        int eingabe;
        do {
            System.out.println("How many acres would you like to sell?");
            System.out.print("> ");
            eingabe = gh.getUserInput();
        } while (!city.sell(eingabe));
      //  System.out.println("New Status: "+city.getTotalAcres() + " acres of land, "+city.getTotalBushels() +" bushels of grain, "+city.getTotalPeople()+" residents.");
        feedMenu();
    }

    public void feedMenu(){
        System.out.println("\n====Feed MENU====");
        System.out.println("City Status: "+city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople()+" residents.");
        int eingabe;
        do {
            System.out.println("How many bushels do you wish to feed your residents?\n20 per person required!");
            System.out.print("> ");
            eingabe = gh.getUserInput();
        } while (!city.feed(eingabe));
       // System.out.println("New Status: "+city.getTotalAcres() + " acres of land, "+city.getTotalBushels() +" bushels of grain, "+city.getTotalPeople()+" residents.");
        plantMenu();
    }

    public void plantMenu(){
        System.out.println("\n====PLANT MENU====");
        System.out.println("City Status: "+city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople()+" residents.");
        int eingabe;
        do {
            System.out.println("How many acres of Land do you wish to plant with seed?");
            System.out.print("> ");
            eingabe = gh.getUserInput();
        } while (!city.plant(eingabe));
           // System.out.println("New Status: "+city.getTotalAcres() + " acres of land, "+city.getTotalBushels() +" bushels of grain, "+city.getTotalPeople()+" residents.");
        status();
    }

    public void status(){
        System.out.println("====STATUS MENU====");
        System.out.println("City Status: "+city.getTotalAcres() + " acres of land, "+city.getTotalBushels() +" bushels of grain, "+city.getTotalPeople()+" residents.");
    }
}
