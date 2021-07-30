package org.ansel.ocp11;

public class Vehicle {

    public static void main(String[] args) {
        int a = 60;
        int b = 30;
        Car car = new Car(a, b);

    }
}

class Car {
    private int speed;
    private int mileage;

    public Car(int speed, int mileage) {
        this.speed = speed;
        this.mileage = mileage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMileage() {
        return mileage;
    }
}
