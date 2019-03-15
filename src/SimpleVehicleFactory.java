import car.BMW;
import car.BYD;
import car.Benz;
import car.Volkswagon;
import inter.Vehicle;

public class SimpleVehicleFactory {

    public Vehicle createVehicle(String type) {
        switch (type) {
            case "car.Benz":
                return new Benz();
            case "car.BMW":
                return new BMW();
            case "car.BYD":
                return new BYD();
            case "car.Volkswagon":
                return new Volkswagon();
        }
        return null;
    }

}
