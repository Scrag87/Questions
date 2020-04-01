package CoffeeMachine;


import CoffeeMachine.CoffeeTypes.Cappuchino;
import CoffeeMachine.CoffeeTypes.Espresso;
import CoffeeMachine.CoffeeTypes.Latte;

public interface iCoffeeMachineActions {
    public void makeCoffee(int quantity, Latte coffeeType);

    public void makeCoffee(int quantity, Cappuchino coffeeType);

    public void makeCoffee(int quantity, Espresso coffeeType);

    public void fillSupplies(int water, int milk, int coffeeBeans, int cups);

    void take();

    void remaining();

    void exit();
}
