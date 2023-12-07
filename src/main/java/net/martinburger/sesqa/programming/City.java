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
    }

    public boolean buy(int acresToBuy) {
        if (acresToBuy * buyCostPerAcre < this.totalBushels) {
            this.totalAcres += acresToBuy;
            this.totalBushels -= buyCostPerAcre * acresToBuy;
            System.out.println(this.totalAcres + " " + this.totalBushels);
            return true;
        } else {
            return false;
        }
    }

    public boolean sell(int acresToSell) {
        if (acresToSell <= this.totalAcres) {
            this.totalAcres -= acresToSell;
            this.totalBushels += acresToSell * sellCostPerAcre;
            return true;
        } else {
            return false;
        }
    }

    public boolean feed(int bushelsToFeed) {
        if (bushelsToFeed <= totalBushels) {
            this.totalBushels -= bushelsToFeed;
            return true;
        } else {
            return false;
        }
    }

    public boolean plant(int acresToPlant) {
        if (acresToPlant <= this.totalAcres && acresToPlant <= this.totalBushels && this.totalPeople <= acresToPlant) {
            this.totalBushels -= acresToPlant;
            return true;
        }
        return false;
    }

    public void tostring() {
        System.out.println("In the year " + this.creationYear + " after its foundation, " + this.totalPeople
                + " inhabitants live in the town of " + this.cityName + ". The town owns " + this.totalBushels +
                " bushels of grain and " + this.totalAcres + " acres of land.");
    }
}