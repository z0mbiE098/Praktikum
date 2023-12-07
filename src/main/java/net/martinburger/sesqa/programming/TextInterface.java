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
        gh.buyStatus();
        int eingabe = gh.getUserInput();
        System.out.println("You bought "+eingabe+" acres.");
        System.out.println("New Status: " +city.getTotalAcres() +" acres of land, "+city.getTotalBushels()+" bushels of grain, "+city.getTotalPeople()+" residents");
    }

    public void sellMenu(){
        gh.sellStatus();
        int eingabe = gh.getUserInput();
        System.out.println("New Status: "+city.getTotalAcres() + " acres of land, "+city.getTotalBushels() +" bushels of grain, "+city.getTotalPeople()+" residents.");
    }

    public void feedMenu(){
        gh.feedStatus();
        int eingabe = gh.getUserInput();
        System.out.println("New Status: "+city.getTotalAcres() + " acres of land, "+city.getTotalBushels() +" bushels of grain, "+city.getTotalPeople()+" residents.");
    }

    public void plantMenu(){
        gh.plantStatus();
        int eingabe = gh.getUserInput();
        System.out.println("New Status: "+city.getTotalAcres() + " acres of land, "+city.getTotalBushels() +" bushels of grain, "+city.getTotalPeople()+" residents.");
    }
}
