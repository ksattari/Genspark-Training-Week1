import java.util.*;
import java.util.stream.*;
import java.util.Collections;

/*
 *  implementation of sort a string
 *  input: unsorted  String
 *  output : returns sorted String of original characters
 *
 */
public class SortAString {

    public static void main(String[] args) {

        String unsorted = "zyxwvutsrqponmlkjihgfedcba";
        unsorted = unsorted.replaceAll("\\s+","");
        System.out.println(unsorted);
        List<Character> sortedList = Arrays.asList(unsorted.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new));
        Collections.sort(sortedList);
        String sortedString = sortedList.toString()     //cut the brackets, space and commas out
                .substring(1, 3 * sortedList.size() - 1)
                .replaceAll(", ", "");
        System.out.println(sortedString);

    }
}
