package strategyPattern.withStrategyPattern;

import strategyPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{

    OffroadVehicle(){
        super(new SportsDriveStrategy());
    }
    
}
