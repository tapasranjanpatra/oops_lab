import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) throws Exception {

        //Herer im creating 2 files object
        File f1 = new File("myfile.txt");
        File f2 = new File("copyfile.txt");

        
        //creating 2 files
        try {
            f1.createNewFile();
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //dummy data in file1
        FileWriter fileWriter = new FileWriter("myfile.txt");
        fileWriter.write("Person1: Hii there!! how are you \nPerson2: I am fine");
        fileWriter.close();




        //displaying contents of file1
        System.out.println("File1 data: ");
        try {
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //for reading the file and writing file
        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out = new FileOutputStream(f2);


        //copying bytes of f1 to f2
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
        

        System.out.println("File 2 data: ");
        try {
            Scanner sc = new Scanner(f2);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
        
        BufferedReader reader = new BufferedReader(new FileReader(f1));

        // Create a temporary file for writing
        File tempFile = new File("temp.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        // Loop through the input file and replace the word
        String line = "";
        while ((line = reader.readLine()) != null) {
           line = line.replaceAll("Person1", "Luffy");
           writer.write(line + "\n");
        }

        // Close the input and output files
        reader.close();
        writer.close();

        // Delete the original input file
        File inputFile = new File("myfile.txt");
        inputFile.delete();

        // Rename the temporary file to the original input file name
        tempFile.renameTo(inputFile);
     } catch (IOException e) {
        e.printStackTrace();
     }

     System.out.println("File 2 data: ");
     try {
         Scanner sc = new Scanner(f1);
         while (sc.hasNextLine()) {
             String line = sc.nextLine();
             System.out.println(line);
         }
     sc.close();
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }

        
    }
}
