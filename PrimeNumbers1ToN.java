import java.util.*;

public class PrimeNumbers1ToN {

    //checks for each number from 1-N, N/2 times average
    // Time complexity is O(N^2)
    public static List<Integer> upToN(int n){
        List<Integer> primes = new ArrayList<>();
         boolean isPrime = true;
        //check each integer from 1 to N with %
        //break if divides evenly with false
        //else true
        for(int x = 2; x <= n; x++){
            for(int j = 2; j < x; j++ ){
                if( (x % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                primes.add(x);
            isPrime = true;
        }
        return primes;
    }
    //uses the relation a ≤ sqrt(N) ≤ b, with a,b being factors of N
    //to cut the search to sqrt(N) for O(N * sqrt(N)) complexity
    public static List<Integer> upToSqrtN(int n){
        List<Integer> primes = new ArrayList<>();
        boolean isPrime = true;

        if( n >= 2 ){
            primes.add(2);
        }
        //check each odd integer from 3 to sqrt(N) with %
        //break if divides evenly with isPrime = false
        //else isPrime = true
        for(int x = 3; x <= n; x += 2){
            for(int j = 3; j <= Math.sqrt(x); j += 2 ){
                if( (x % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                primes.add(x);
            isPrime = true;
        }
        return primes;
    }


    public static void main(String[] args){

        //method 1 O(n)^2 time complexity
        System.out.println("\n---------------method 1 O(n^2) time complexity---------------\n");
        List<Integer> primes = upToN(1000);
        System.out.println("The primes form 1-1000 are " + primes);
        System.out.println("The count is " + primes.size());
        //method 2 O(N * sqrt(N)) time complexity
        System.out.println("\n---------------method 2 O(n * sqrt(n)) time complexity---------------\n");
        primes = upToSqrtN(1000);
        System.out.println("The primes form 1-1000 are " + primes);
        System.out.println("The count is " + primes.size());

    }
}
