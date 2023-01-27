public class MethodOverloading {

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public float add(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {

        MethodOverloading over = new MethodOverloading();
        System.out.println(over.add(5,6));
        System.out.println((over.add(5,6,7)));
        System.out.println(over.add(4.5f,6.7f));
    }
}
