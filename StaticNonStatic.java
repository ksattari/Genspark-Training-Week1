public class StaticNonStatic {

    public static void foo(){
        System.out.println("I am a static method");
    }
    public void fooObj(){
        System.out.println("I am a non static method, need an object");
    }

    public static void main(String[] args) {

        foo();
        new StaticNonStatic().fooObj();
    }
}
