import java.util.Scanner;

public class VowelOrConsonant {

    static final String VOWELS = "aeiou";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String character = scanner.nextLine();

        //if -1 is returned, the character is not a vowel
        int index = VOWELS.indexOf(character.toLowerCase());
        if(index != -1) {
            System.out.println( character +" is a vowel.");
        }
        else
            System.out.println(character + " is a consonant.");

    }
}
