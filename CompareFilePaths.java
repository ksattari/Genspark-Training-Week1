import java.io.*;

public class CompareFilePaths {

    public static void main(String[] args) {
          File f1 = new File("C:\\users\\jim\\readme.txt");
          File f2 = new File("E:\\users\\joe\\readme.txt");
         System.out.println(f1.toPath().equals(f2.toPath()));

    }
}
