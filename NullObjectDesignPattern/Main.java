public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");

        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println(vehicle.getSeatingCapacity());
        System.out.println(vehicle.getTankcapacity());
    }
}
