class StaticDemo {

    static int i = 0;

    static {
        System.out.println("--------Static block load Begin--------");
        System.out.println("Here we can assign\\check static variables");
        System.out.println("Value of static variable i is " + i);
        System.out.println("--------Static block load end--------");
    }

    public StaticDemo(){
        i++;
    }

    public void displayInstances() {
        System.out.println("Number of StaticDemo instances:" + i);
    }

}
public class StaticDemoDriver {

    public static void main(String[] args) {
        new StaticDemo().displayInstances();
        new StaticDemo().displayInstances();
    }
}
