import java.io.*;

public class CheckedUncheckedExceptions {

    public static void main(String[] args) {

        // throws unchecked Exception
        try {
           int quot = 8 / 0;
       } catch(ArithmeticException e){
           System.out.println(e.getMessage());
           e.printStackTrace();
       }

        //try opening a file stream throws checked Exception
        File f = new File("D:\fakefile.txt");
        try {
            FileInputStream in = new FileInputStream(f);
        } catch( FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
