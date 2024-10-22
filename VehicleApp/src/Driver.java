import java.util.Scanner;

public class Driver {
    Vehicle car;
    Vehicle EBike;
    Vehicle bus;
    Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Vehicle App V1.0");
        new Driver();

    }

    public Driver() {
        car = new Vehicle(4, 20000, "BYD", "Song" ,4);
        EBike = new Vehicle(2,200,"7ma","def",2);
        System.out.println("The number of passengers: ");
        int numpassengers = input.nextInt();

    }
    public void checkBestVehicle(){

    }
    public void addVehicle() {
        System.out.println("Enter Make: " );
        String carMake = input.nextLine();
        System.out.println("Enter Model: " );
        String carModel = input.nextLine();
        System.out.println("Enter Price: " );
        float carPrice = input.nextFloat();
        System.out.println("Enter Passengers: " );
        int carPassengers = input.nextInt();
    }
}
