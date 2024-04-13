package com.example.calkulator.probnik;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);
        Car car1 = new Car("Mersedes", 4);
        Bicycle bicycle = new Bicycle("bicikle", 2);
        Bicycle bicycle1 = new Bicycle("bicikleThree", 3);
        Truck truck = new Truck("Man", 2);
        Truck truck1 = new Truck("Meren", 8);
        ServiceStation station = new ServiceStation();
        station.check(truck1);

    }
}
