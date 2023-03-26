import java.io.*;
import java.util.Scanner;

public class FindnReplace {
    public static void main(String[] args) {

        File f1 = new File("File2.txt");
        try {
        
            BufferedReader reader = new BufferedReader(new FileReader(f1));
    
            // Create a temporary file for writing
            File tempFile = new File("temp.txt");
            tempFile.createNewFile();
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
