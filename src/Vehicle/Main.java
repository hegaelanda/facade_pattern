package Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleMaker vm = new VehicleMaker();
        for (int i = 0; i < 11; i++) {
            vm.gasMotorcycle();
        }
        for (int j = 0; j < 11; j++) {
            vm.brakeMotorcycle();
        }
        for (int i = 0; i < 11; i++) {
            vm.gasCar();
        }
        for (int j = 0; j < 11; j++) {
            vm.brakeCar();
        }
    }
}
