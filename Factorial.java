public class Factorial {

    public static int recursive(int n){

        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        // recursive step
        return n * recursive(n-1);
    }
    public static int iterative(int n){

        if( n == 0){
            return 1;
        }
        int factorial = 1;
        for(int x = 2; x <= n; x++){
            factorial *= x;
        }
        return factorial;
    }

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        //recursive factorial call
        System.out.println("Recursive method " + recursive(num));
        //iterative factorial call
        System.out.println("Iteration method " + iterative(num));
    }
}
