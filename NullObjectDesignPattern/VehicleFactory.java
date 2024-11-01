public class VehicleFactory {
    static Vehicle getVehicleObject(String vehicleName){
        if("Car".equals(vehicleName)){
            return new Car();
        }

        return new NullVehicle();
    }
}
