public class Main {

    public static void main(String[] args) {
        FourSStore fourSStore = new FourSStore(new SimpleVehicleFactory());
        fourSStore.orderVehicle("car.Benz");
    }
}
