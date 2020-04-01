package CoffeeMachine;

import CoffeeMachine.CoffeeTypes.Cappuchino;
import CoffeeMachine.CoffeeTypes.Espresso;
import CoffeeMachine.CoffeeTypes.Latte;

public class CoffeeMachine implements iCoffeeMachineActions {
    int cash = 550;
    int water = 400; //1200
    int milk = 540;
    int coffeeBeans = 120;
    int cup = 9;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setCashToZero() {
        this.cash = 0;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {

        this.cup = cup;
    }

    private void printSupply() {
        System.out.println("The coffee machine has:");
        System.out.println(getWater() + " of water");
        System.out.println(getMilk() + " of milk");
        System.out.println(getCoffeeBeans() + " of coffee beans");
        System.out.println(getCup() + " of disposable cups");
        System.out.println(getCash() + "$ of money");
        System.out.println();
    }

    public boolean isEnoughResources(int quantity, Coffee coffeeType) {

        boolean isEnoughWater;
        boolean isEnoughMilk;
        boolean isEnoughCoffeeBeans;
        boolean isEnoughCups;

        if ((this.getCup() - quantity) >= 0) isEnoughCups = true;
        else {
            System.out.println("Sorry, not enough cups");
            return false;
        }

        if ((this.getWater() - quantity * coffeeType.water) >= 0) isEnoughWater = true;
        else {
            System.out.println("Sorry, not enough water");
            return false;
        }

        if ((this.getMilk() - quantity * coffeeType.milk) >= 0) isEnoughMilk = true;
        else {
            System.out.println("Sorry, not enough water!");
            return false;
        }

        if ((this.getCoffeeBeans() - quantity * coffeeType.coffeeBeans) >= 0) isEnoughCoffeeBeans = true;
        else {
            System.out.println("Sorry, not enough coffee beans");
            return false;
        }

        if (isEnoughCoffeeBeans && isEnoughMilk && isEnoughWater && isEnoughCups) {
            return true;
        } else {
            return false;
        }
    }

    public void makeCoffee(int quantity, Latte coffeeType) {
        if (isEnoughResources(quantity, coffeeType)) {

            System.out.println("I have enough resources, making you a coffee!");

            this.setCup(this.getCup() - quantity);
            this.setCash(this.getCash() + quantity * coffeeType.getPrice());
            this.setCoffeeBeans(this.getCoffeeBeans() - quantity * coffeeType.getCoffeeBeans());
            this.setMilk(this.getMilk() - quantity * coffeeType.getMilk());
            this.setWater(this.getWater() - quantity * coffeeType.getWater());


        } else
            System.out.println("Sorry, not enough resources ");
    }

    @Override
    public void makeCoffee(int quantity, Cappuchino coffeeType) {


        if (isEnoughResources(quantity, coffeeType)) {

            System.out.println("I have enough resources, making you a coffee!");

            this.setCup(this.getCup() - quantity);
            this.setCash(this.getCash() + quantity * coffeeType.getPrice());
            this.setCoffeeBeans(this.getCoffeeBeans() - quantity * coffeeType.getCoffeeBeans());
            this.setMilk(this.getMilk() - quantity * coffeeType.getMilk());
            this.setWater(this.getWater() - quantity * coffeeType.getWater());


        } else
            System.out.println("Sorry, not enough resources ");

    }

    @Override
    public void makeCoffee(int quantity, Espresso coffeeType) {
        if (isEnoughResources(quantity, coffeeType)) {
            System.out.println("I have enough resources, making you a coffee!");
            this.setCup(this.getCup() - quantity);
            this.setCash(this.getCash() + quantity * coffeeType.getPrice());
            this.setCoffeeBeans(this.getCoffeeBeans() - quantity * coffeeType.getCoffeeBeans());
            this.setMilk(this.getMilk() - quantity * coffeeType.getMilk());
            this.setWater(this.getWater() - quantity * coffeeType.getWater());
        } else
            System.out.println("Sorry, not enough resources ");

    }


    public void fillSupplies(int water, int milk, int coffeeBeans, int cups) {
        this.setWater(this.getWater() + water);
        this.setMilk(this.getMilk() + milk);
        this.setCoffeeBeans(this.getCoffeeBeans() + coffeeBeans);
        this.setCup(this.getCup() + cups);
    }

    public void take() {
        System.out.println("I gave you $" + this.getCash());
        this.setCashToZero();
    }

    public void remaining() {
        this.printSupply();
    }

    public void exit() {
        System.exit(1);
    }

    public enum State {
        MAIN_MENU,
        BUY_MENU,
        POWER_ON,
        MAKE_CAPPUCCINO,
        MAKE_ESPRESSO,
        MAKE_LATTE,
        FILL,
        BUY,
        TAKE,
        REMAINING,
        POWER_OFF,
        CHOOSING_AN_ACTION,
        CHOOSING_A_VARIANT_OF_COFFEE;
    }

}
