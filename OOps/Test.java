import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) {

        //Herer im creating 2 files
        File f1 = new File("myfile.txt");
        System.out.println("File 1 created...");
        File f2 = new File("copyfile.txt");
        System.out.println("File 2 created...");
        try {
            f1.createNewFile();
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

            try {
                //for reading the file and writing file
                FileInputStream in = new FileInputStream(f1);
                FileOutputStream out = new FileOutputStream(f2);
                
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        


        //dummy data in file1
        try {
            FileWriter fileWriter = new FileWriter("myfile.txt");
            fileWriter.write("Person1: Hii there!! how are you \nPerson2: I am fine");
            fileWriter.close();
        
        } catch (IOException e) {
            e.printStackTrace();
        }

                    try {
                Scanner sc = new Scanner(Obj);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);

                }

                sc.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        
    }
}
