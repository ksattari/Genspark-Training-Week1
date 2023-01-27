//uses toString() override of Object class
public class MethodOverride {

    public String toString() {
        return "I have overridden toSting inherited from Object class!";
    }

    public static void main(String[] args) {
        System.out.println(new MethodOverride());
    }
}
