
/* searches a string for a specific char
 * @author Khashayar Sattari
 *
 * Precondition: string is in lexical order
 * Time Complexity: O(nlogn)
 */
public class BinarySearch {


   //searches sorted string for char c
   public static boolean search(char c, String word) {
        if (word.length() == 0)
            return c == Character.MIN_VALUE;
        int mid = word.length() / 2;
        if (c == word.charAt(mid))
            return true;
        else if (c < word.charAt(mid))
            return search( c, word.substring(0,mid));
        else
            return search( c, word.substring(mid+1,word.length()));
    }
    public static void main(String[] args) {

        System.out.println(search('y', "abcdefghijklmnopqrstuvwxz"));
        System.out.println(search('a', "abcdefghijklmnopqrstuvwxyz"));
    }
}
