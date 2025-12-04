// Base Class
class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    
    double calculateFuelEfficiency() {
        return 0;
    }

    double distanceTraveled(double fuelUsed) {
        return calculateFuelEfficiency() * fuelUsed;
    }

    double maxSpeed() {
        return 0;
    }

    void showInfo() {
        System.out.println("Make: " + make +
                           ", Model: " + model +
                           ", Year: " + year +
                           ", Fuel Type: " + fuelType);
    }
}


class Truck extends Vehicle {

    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 6.5; 
    }

    @Override
    double maxSpeed() {
        return 120;
    }
}


class Car extends Vehicle {

    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 15.0; 
    }

    @Override
    double maxSpeed() {
        return 180; 
    }
}


class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 35.0; 
    }

    @Override
    double maxSpeed() {
        return 220; 
    }
}

// Main Class
 class VehicleDemo {
    public static void main(String[] args) {

        Vehicle t = new Truck("Tata", "LPT 1615", 2020, "Diesel");
        Vehicle c = new Car("Toyota", "Corolla", 2022, "Petrol");
        Vehicle m = new Motorcycle("Honda", "CBR 250R", 2021, "Petrol");

        System.out.println("---- TRUCK ----");
        t.showInfo();
        System.out.println("Fuel Efficiency: " + t.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 20 L fuel: " + t.distanceTraveled(20) + " km");
        System.out.println("Max Speed: " + t.maxSpeed() + " km/h\n");

        System.out.println("---- CAR ----");
        c.showInfo();
        System.out.println("Fuel Efficiency: " + c.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 20 L fuel: " + c.distanceTraveled(20) + " km");
        System.out.println("Max Speed: " + c.maxSpeed() + " km/h\n");

        System.out.println("---- MOTORCYCLE ----");
        m.showInfo();
        System.out.println("Fuel Efficiency: " + m.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 20 L fuel: " + m.distanceTraveled(20) + " km");
        System.out.println("Max Speed: " + m.maxSpeed() + " km/h");
    }
}
