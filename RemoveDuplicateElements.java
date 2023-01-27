import java.util.*;

public class RemoveDuplicateElements {
    public static void main(String[] args) {

        Integer[] arr = {1,1,3,1,6,9,4,7,1,2,9};
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        arr =  set.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
