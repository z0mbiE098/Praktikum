package net.martinburger.sesqa.programming;

import java.util.Random;
import java.util.Scanner;
public class City {
    private String cityName;
    private int totalBushels;
    private int totalAcres;
    private int totalPeople;
    private int usedBushels;
    private int sizeField;
    private int creationYear;
    private int buyCostPerAcre;
    private int sellCostPerAcre;
    private int deadPeople;

    Random random = new Random();

    public int getTotalBushels() {
        return totalBushels;
    }

    public void setTotalBushels(int totalBushels) {
        this.totalBushels = totalBushels;
    }

    public int getTotalAcres() {
        return totalAcres;
    }

    public void setTotalAcres(int totalAcres) {
        this.totalAcres = totalAcres;
    }

    public int getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(int totalPeople) {
        this.totalPeople = totalPeople;
    }

    public int getBuyCostPerAcre() {
        return buyCostPerAcre;
    }

    public void setBuyCostPerAcre(int buyCostPerAcre) {
        this.buyCostPerAcre = buyCostPerAcre;
    }

    public int getSellCostPerAcre() {
        return sellCostPerAcre;
    }

    public void setSellCostPerAcre(int sellCostPerAcre) {
        this.sellCostPerAcre = sellCostPerAcre;
    }


    public City() {
        this.cityName = "Bubatzland";
        this.totalBushels = 2800;
        this.totalAcres = 1000;
        this.totalPeople = 100;
        this.creationYear = 0;
        this.buyCostPerAcre = random.nextInt(10) + 17;
        this.sellCostPerAcre = random.nextInt(10) + 17;
        this.deadPeople = (20 * this.totalPeople - this.totalBushels)/20;
    }

   public boolean buy(int acresToBuy) {
        while (acresToBuy * buyCostPerAcre > this.totalBushels) {
            System.out.println("Not enough bushels! Please try again.");
            return false;
        }

        this.totalAcres += acresToBuy;
        this.totalBushels -= buyCostPerAcre * acresToBuy;
        return true;
    }
    
    public boolean sell(int acresToSell){
       while(acresToSell > this.totalAcres){
           System.out.println("Not enough Acres to sell! Please try again. ");
           return false;
       }
       this.totalAcres -= acresToSell;
        this.totalBushels += acresToSell * sellCostPerAcre;
       return true;
    }

    public boolean feed(int bushelsToFeed){
        while(bushelsToFeed > totalBushels){
            System.out.println("Please try again. ");
            return false;
        }
        this.totalBushels -= bushelsToFeed;
        return true;
    }

    public boolean plant(int acresToPlant) {
     /*   if (acresToPlant <= this.totalAcres && acresToPlant <= this.totalBushels && this.totalPeople <= acresToPlant) {
            this.totalBushels -= acresToPlant;
            return true;
        }
        return false;*/
        while (acresToPlant > this.totalAcres && acresToPlant > this.totalBushels && this.totalPeople > acresToPlant){
            System.out.println("Please try again: ");
            return false;
        }
        this.totalBushels -= acresToPlant;
        return true;
    }

    public void gesamtErnte(){
        double ernteFaktor = 6.0;
        double z = random.nextDouble();
        double ernteRate = z*ernteFaktor;
        int harvest = (int) Math.round(ernteRate);
        System.out.println(harvest);
    }

    public void runTurn(int starvedPeople, int acresToPlant){
        //Calculate Hunger
        int requiredBushels = this.totalBushels *20;

        //Hungersnot
        if (this.totalBushels >= requiredBushels){
            this.totalBushels -= requiredBushels;
        } else {
            int peopleUnfed = this.totalPeople -(totalBushels/20);
            this.totalPeople -= peopleUnfed;
            this.deadPeople += peopleUnfed;
            this.totalBushels =0;
        }

        // calculate population increase
        double deathRate = ;
        double hungryPeople = deathRate * this.totalPeople;
        if (hungryPeople < 0.4){
            double growthRate = random.nextDouble() * 0.4;
            double incomingPeople = growthRate * this.totalPeople;
            this.totalPeople += incomingPeople;
        } else {
            System.out.println("...........");
        }
        //calculate total harvest
        double ernteFaktor = 6.0;
        double z = 0.1 + Math.random() * 0.9;
        double ernteRate = z*ernteFaktor;
        int harvest = (int) Math.round(ernteRate * acresToPlant);

        creationYear++;

    }

    public void tostring() {
        System.out.println("In the year " + this.creationYear + " after its foundation, " + this.totalPeople
                + " inhabitants live in the town of " + this.cityName + ". The town owns " + this.totalBushels +
                " bushels of grain and " + this.totalAcres + " acres of land.");
    }
}

//bonjourno