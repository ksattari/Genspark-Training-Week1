/* searches an array for a specific nuimber
 * @author Khashayar Sattari
 *
 * Precondition: string is in lexical order
 * Time Complexity: O(n)
 */

public class LinearSearch {

    public static boolean search(int key, int[] nums){
        for(int num: nums){
            if(num == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] numbers = {1,45,6,7,89,23,14,567,54,11,2,4};
        System.out.println(search(100, numbers ));  // false
        System.out.println(search(567, numbers ));  // true
    }
}
