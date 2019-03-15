package car;

import inter.Vehicle;

public class Benz implements Vehicle {

    @Override
    public double price() {
        return 500000;
    }

    @Override
    public String brand() {
        return "car.Benz";
    }

    @Override
    public float oilWear() {
        return 21;
    }

    @Override
    public float outputVolumn() {
        return 6;
    }
}
