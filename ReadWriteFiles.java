import java.io.*;

public class ReadWriteFiles {

    public static void main(String[] args) {

        // Reading data from file
        File f1 = new File(args[0]);
        FileReader fr = null;
        try {
            fr = new FileReader(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);

        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Writing data
        File f2 = new File(args[1]);
        FileWriter fw = null;
        try {
            fw = new FileWriter(f2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        while (s != null) {
            try {
                bw.write(s);
                bw.newLine();
                System.out.println(s);
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

