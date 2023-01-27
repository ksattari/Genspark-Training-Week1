//demonstrates the use of super keyword
class A {
    public A(){
        System.out.println("----Inside class A constructor----");
    }
}
class B extends A {
    public B() {
        super();
        System.out.println("----Inside class B constructor----");
    }
}

public class UseOfSuperKeyword {

    public static void main(String[] args) {
        new B();
    }
}
