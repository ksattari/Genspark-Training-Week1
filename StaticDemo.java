public class StaticDemo {

    static int i = 5;

    static void display(int i){
        System.out.println(StaticDemo.i);
    }

    public static void main(String[] args) {
        display(23);
    }
}
