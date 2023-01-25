 abstract class Vehicle{
    String color;

    public Vehicle(String color){
        this.color = color;
    }
    public abstract String make();
    public abstract String model();

}

public class AbstractClassCreationExample {

    public static void main(String[] args) {

        // Gives complication error : java: Vehicle is abstract; cannot be instantiated
        Vehicle myVehicle  = new Vehicle("red");
    }
}
