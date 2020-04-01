package CoffeeMachine.CoffeeTypes;

import CoffeeMachine.Coffee;

public class Espresso extends Coffee {

    private int water = 250;
    private int milk = 0;
    private int coffeeBeans = 16;
    private int price = 4;

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
