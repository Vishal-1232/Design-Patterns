package DecoratorDesignPattern.Decorators;

import DecoratorDesignPattern.BasePizza;

public class ExtraCheeseToppingDecorator extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheeseToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 60;
    }

}
