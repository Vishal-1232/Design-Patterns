package DecoratorDesignPattern;

import DecoratorDesignPattern.Decorators.ExtraCheeseToppingDecorator;
import DecoratorDesignPattern.Decorators.MushroomToppingDecorator;

public class PizzaShop {

    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheeseToppingDecorator(new VegDelightPizza());
        BasePizza pizza2 = new MushroomToppingDecorator(new FarmHousePizza());
        BasePizza pizza3 = new ExtraCheeseToppingDecorator(new MushroomToppingDecorator(new MargheritaPizza()));

        System.out.println("Veg Delight with extra cheese: " + pizza.cost());
        System.out.println("Farm house pizza with mushroom topping: " + pizza2.cost());
        System.out.println("Margherita pizza with Mushroop and extra cheese topping: " + pizza3.cost());
    }

}
