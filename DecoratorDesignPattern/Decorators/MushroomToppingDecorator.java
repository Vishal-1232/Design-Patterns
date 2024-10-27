package DecoratorDesignPattern.Decorators;

import DecoratorDesignPattern.BasePizza;

public class MushroomToppingDecorator extends ToppingDecorator {
    BasePizza basePizza;

    public MushroomToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 80;
    }
}
