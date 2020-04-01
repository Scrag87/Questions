package CoffeeMachine;

import CoffeeMachine.CoffeeTypes.Cappuchino;
import CoffeeMachine.CoffeeTypes.Espresso;
import CoffeeMachine.CoffeeTypes.Latte;

public class Main {

    public static void main(String[] args) {
        Latte latte = new Latte();
        Espresso espresso = new Espresso();
        Cappuchino cappuchino = new Cappuchino();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.remaining();
        coffeeMachine.makeCoffee(1, latte);
        coffeeMachine.remaining();
        coffeeMachine.makeCoffee(1, cappuchino);
        coffeeMachine.remaining();
        coffeeMachine.makeCoffee(1, espresso);

        coffeeMachine.remaining();
    }


}
