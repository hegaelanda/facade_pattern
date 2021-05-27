package Vehicle;

public class VehicleMaker {
    private Vehicle motorcycle;
    private Vehicle car;

    public VehicleMaker() {
        motorcycle = new Motorcycle();
        car = new Car();
    }
    
    public void gasMotorcycle(){
        motorcycle.gas();
    }
    
    public void brakeMotorcycle(){
        motorcycle.brake();
    }
    
    public void gasCar(){
        car.gas();
    }
    
    public void brakeCar(){
        car.brake();
    }
}
