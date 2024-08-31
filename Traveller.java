package Q02;

public class Traveller {

    private Vehicle vehicle;

    public Traveller(Vehicle vehicle) {

        this.vehicle = vehicle;

    }

    public void travellerVehicleName() {

        vehicle.name();

    }

    public static void main(String[] args) {

        Vehicle bike = new Bike();

        Vehicle car = new Car();

        Traveller traveller1 = new Traveller(bike);

        traveller1.travellerVehicleName();

        Traveller traveller2 = new Traveller(car);

        traveller2.travellerVehicleName();

    }

}


