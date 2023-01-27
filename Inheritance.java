class Bipedal{
    private final int feet = 2;

    public void walk(){
        System.out.println("Walks with " + feet + " feet.");
    }
}

class Human extends Bipedal {

}
class Ape extends Bipedal {

}

public class Inheritance {

    public static void main(String[] args) {
        new Human().walk();
        new Ape().walk();

    }
}
