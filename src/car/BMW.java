package car;

import inter.Vehicle;

public class BMW implements Vehicle {

    @Override
    public double price() {
        return 600000;
    }

    @Override
    public String brand() {
        return "car.BMW";
    }

    @Override
    public float oilWear() {
        return 6;
    }

    @Override
    public float outputVolumn() {
        return 2.8f;
    }
}
