package car;

import inter.Vehicle;

public class BYD implements Vehicle {

    @Override
    public double price() {
        return 700000;
    }

    @Override
    public String brand() {
        return "car.BYD";
    }

    @Override
    public float oilWear() {
        return 7;
    }

    @Override
    public float outputVolumn() {
        return 3.6f;
    }
}
