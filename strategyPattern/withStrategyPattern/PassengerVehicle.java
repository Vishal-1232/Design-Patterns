package strategyPattern.withStrategyPattern;

import strategyPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }

}
