// demonstrates abstraction in a class
class Boat {

    private boolean engine;

    public void turnOn(){
        engine = true;
        // add code needed to change state of the object
        // all of it wil be abstracted by encapsulation messages to via methods like this
    }

    public void turnOff(){
        engine = false;
    }
}

public class AbstractionInClass {

    public static void main(String[] args) {

        Boat b = new Boat();
        b.turnOn();
    }
}
