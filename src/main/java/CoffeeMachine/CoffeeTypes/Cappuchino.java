package CoffeeMachine.CoffeeTypes;

import CoffeeMachine.Coffee;

public class Cappuchino extends Coffee {
    private int water = 200;
    private int milk = 100;
    private int coffeeBeans = 12;
    private int price = 6;

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
