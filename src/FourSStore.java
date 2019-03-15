import inter.Vehicle;

public class FourSStore {
    private SimpleVehicleFactory factory;
    public FourSStore(SimpleVehicleFactory factory){
        this.factory = factory;
    }

    public Vehicle orderVehicle(String type){

        Vehicle vehicle;
        if(factory != null){
            vehicle = factory.createVehicle(type);
            System.out.println(vehicle.brand()+"\n");
            System.out.println(vehicle.price()+"\n");
            System.out.println(vehicle.oilWear()+"\n");
            System.out.println(vehicle.outputVolumn()+"\n");
            return  vehicle;
        }
        return null;

    }
}
