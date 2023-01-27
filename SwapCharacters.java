//swaps all pair of characters from left to right, if
//odd last character is left unchanged
public class SwapCharacters {

    public static void main(String[] args) {
        String example = "GeeksForGeeks";
        char[] arr = example.toCharArray();
        for(int i=0; i < arr.length-1; i +=2){
            char tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }
        System.out.println("Original string: " + example);
        example = new String(arr);
        System.out.println("Swapped characters: " + example );
    }
}
