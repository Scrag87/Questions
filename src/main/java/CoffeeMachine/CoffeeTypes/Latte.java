package CoffeeMachine.CoffeeTypes;

import CoffeeMachine.Coffee;

public class Latte extends Coffee {
    private int water = 350;
    private int milk = 75;
    private int coffeeBeans = 20;
    private int price = 7;

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getPrice() {
        return price;
    }


}
