 class Car{
    String name;

    public Car(String model){
        this.name = model;
    }

    public String toString(){
        return this.name;
    }

}

public class ClassAndObjectExample {

    public static void main(String[] args) {

        Car myCar = new Car("BMW");
        System.out.println("My car is a " + myCar);
    }
}
