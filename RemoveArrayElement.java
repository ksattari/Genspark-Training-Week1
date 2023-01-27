import java.util.Arrays;

//removes all occurrences of element from array
public class RemoveArrayElement {

    public static int[] removeAllElement(int[] arr, int key){

        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != key){
                arr[j++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, j);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 3, 3, 5, 8, 9, 3};
        System.out.println(Arrays.toString(arr1));
        arr1 = removeAllElement(arr1, 3);
        System.out.println(Arrays.toString(arr1));
    }
}
