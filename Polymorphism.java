abstract class Language {
    public abstract void greeting();
}

class English extends Language{
    public void greeting(){
        System.out.println("Hello how are you?");
    }
}
class German extends Language{
    public void greeting(){
        System.out.println("guten Tag, wie geht es dir?");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Language l1 = new English();
        Language l2 = new German();

        l1.greeting();
        l2.greeting();

        //we can point l1 to any child object of Language
        l1 = l2;
        l1.greeting();

    }
}
