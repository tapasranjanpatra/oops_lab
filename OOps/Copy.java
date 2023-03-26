import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {

        File f1 = new File("File1.txt");
        File f2 = new File("File2.txt");


        try{
            FileInputStream in = new FileInputStream(f1);
            FileOutputStream out = new FileOutputStream(f2);
            try {
                int n;
                while ((n = in.read()) != -1) {
                    out.write(n);
                }
            }
            finally {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }

        }catch(Exception e){

        }
        

        System.out.println("Copied form File1 to File2 \nNew data of File2: ");
        try {
            Scanner sc = new Scanner(f2);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
