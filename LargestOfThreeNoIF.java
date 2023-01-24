//finds the maximum of three numbers without using IF THEN ELSE, only pure function call.
public class LargestOfThreeNoIF {

    public static void main(String[] args){
        double a,b,c;
        double max = Double.NEGATIVE_INFINITY;
        a = 50;
        b = 40;
        c = 30;

        max = Math.max(Math.max(a,b),c);
        System.out.print("The max is: " + max);

    }
}
