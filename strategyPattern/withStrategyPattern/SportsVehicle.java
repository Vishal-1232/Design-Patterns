package strategyPattern.withStrategyPattern;

import strategyPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }

}
