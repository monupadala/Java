class Vehicle {
    protected int speed; 
    protected double fuel; 

    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }
    public void move() {
        System.out.println("The vehicle is moving at a speed of " + speed + " km/h.");
    }
}

class Car extends Vehicle {
    private boolean hasAirConditioner;
    public Car(int speed, double fuel, boolean hasAirConditioner) {
        super(speed, fuel);
        this.hasAirConditioner = hasAirConditioner;
    }

    public void turnOnAC() {
        if (hasAirConditioner) {
            System.out.println("Air conditioner is turned on.");
        } else {
            System.out.println("This car does not have an air conditioner.");
        }
    }
}

class Bike extends Vehicle {
    private boolean hasKickStart;
    public Bike(int speed, double fuel, boolean hasKickStart) {
        super(speed, fuel);
        this.hasKickStart = hasKickStart;
    }

    public void startBike() {
        if (hasKickStart) {
            System.out.println("The bike has a kick-start mechanism.");
        } else {
            System.out.println("The bike has a self-start mechanism.");
        }
    }
}

class Truck extends Vehicle {
    private int cargoCapacity; 
    public Truck(int speed, double fuel, int cargoCapacity) {
        super(speed, fuel);
        this.cargoCapacity = cargoCapacity;
    }
    public void loadCargo() {
        System.out.println("The truck can load up to " + cargoCapacity + " kg of cargo.");
    }
}
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car(120, 50.5, true);
        System.out.println("Car Details:");
        myCar.move();
        myCar.turnOnAC();
        System.out.println();

        // Creating a Bike object
        Bike myBike = new Bike(80, 10.2, false);
        System.out.println("Bike Details:");
        myBike.move();
        myBike.startBike();
        System.out.println();

        // Creating a Truck object
        Truck myTruck = new Truck(60, 150.0, 5000);
        System.out.println("Truck Details:");
        myTruck.move();
        myTruck.loadCargo();
    }
}
