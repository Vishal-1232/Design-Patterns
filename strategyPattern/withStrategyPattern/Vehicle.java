package strategyPattern.withStrategyPattern;

import strategyPattern.withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    // Constructor injection
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
