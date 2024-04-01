package driver;

import java.util.Scanner;

import model.Car;
import model.Motor;
import model.Vehicle;
import model.VehicleType;
import model.Truck;


public class VehicleDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle Car = new Car("Toyota ", "Avanza", 2019);
        Vehicle Motor = new Motor("Yamaha ", "NMax", 2020);
        Vehicle Truck = new Truck("Isuzu ", "Elf", 2018);

        System.out.println("Choose Vehicle Type: ");
        int choice = scanner.nextInt();
        VehicleType vehicleType = VehicleType.values()[choice];

        switch (choice) {
            case 0:
            vehicleType = VehicleType.CAR;
            break;
            case 1:
            vehicleType = VehicleType.MOTOR;
            break;
            case 2:
            vehicleType = VehicleType.TRUCK;
            break;
            default:
            System.out.println("Invalid choice");
        }

        if (vehicleType == VehicleType.CAR){
            Car.drive();
            Car.stop();
        } else if (vehicleType == VehicleType.MOTOR){
            Motor.drive();
            Motor.stop();
        } else if (vehicleType == VehicleType.TRUCK){
            Truck.drive();
            Truck.stop();
        }

        scanner.close();
    }
}
