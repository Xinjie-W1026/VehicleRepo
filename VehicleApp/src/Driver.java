import java.util.Scanner;

public class Driver {

    Vehicle car;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vehicle App V1.0");
        Driver driver = new Driver();
        driver.addVehicle();
        driver.printVehicle();
        driver.checkBestVehicle();
    }

    public void addVehicle() {
        System.out.print("Enter Make : ");
        String carMake = input.nextLine();
        System.out.print("Enter Model : ");
        String carModel = input.nextLine();
        System.out.print("Enter Price : ");
        float carPrice = input.nextFloat();
        System.out.print("Enter Passengers : ");
        int carPassengers = input.nextInt();
        System.out.print("Enter Wheels : ");
        int carWheels = input.nextInt();

        car = new Vehicle(carMake, carModel, carPrice,
                carPassengers,carWheels);

    }

    public void printVehicle() {
        System.out.println(car);
    }

    public void checkBestVehicle() {
        System.out.print("Enter Number of Passengers : ");
        int numPassengers = input.nextInt();
        System.out.println("Passengers Entered : " + numPassengers);

        if(numPassengers >= 1 && numPassengers <= 2)
            System.out.println("EBike is Best");
        else if(numPassengers >= 3 && numPassengers <= 5)
            System.out.println("Car is Best : ");
        else if(numPassengers >= 6 && numPassengers <= 20)
            System.out.println("Bus is Best : ");
        else
            System.out.println("Sorry, no Vehicle Available");
    }

}

