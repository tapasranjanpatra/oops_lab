import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {

        

        File f1 = new File("File1.txt");
        File f2 = new File("File2.txt");


        //Creating file
        try {
            f1.createNewFile();
            f2.createNewFile();
            System.out.println("File created succefully");
        } catch (Exception e) {
            System.out.println("Files are not created");
            System.out.println(e);
        }

        //Writing dummy data in file1
        try {
            FileWriter fr = new FileWriter(f1);
            fr.write("Person1: Hii there!! how are you \nPerson2: I am fine");
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }



        //Display content of file1
        try {
            Scanner obj = new Scanner(f1);
            while(obj.hasNextLine())
            {
                String line = obj.nextLine();
                System.out.println(line);
            }
           
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
