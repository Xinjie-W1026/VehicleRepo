public class Vehicle {
    private int passengers, numwheels;
    private String make, model;
    private float price;

    public Vehicle(){
        passengers = 5;
        make = "BYD";
        model = "QING";
        price = 50000.0f;
        numwheels = 4;
    }
    public Vehicle(int passengers, float price, String make, String model,int numwheels ) {
        setPassengers(passengers);
        setWheels(numwheels);
        setMake(make);
        setModel(model);
        setPrice(price);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getWheels() {
        return numwheels;
    }

    public void setWheels(int wheels) {
        this.numwheels = wheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String toString(){
        return "Vehicle details" + "\n" + "Passengers: " + passengers +
                ",Make : " + make +
                ",Model : " + model +
                ",wheels : " + numwheels
                +"\n";
    }
    public void display(){
        System.out.println("Vehicle details");
        System.out.print("Passengers: " + passengers);
        System.out.print(",Make : " + make);
        System.out.print(",Model : " + getModel());
        System.out.println(",wheels : " + getWheels());
    }
}
