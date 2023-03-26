import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.Scanner;
import java.awt.Graphics;


public class CheckedExcp {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      int ch = 0;

      do{
         System.out.println("Enter the exception you want to check: ");
         System.out.println("1. FileNotFoundException");
         System.out.println("2. SQLException");
         System.out.println("3. ClassNotFoundException");
         System.out.println("4. InterruptedException");
         System.out.println("5. Exit");
         System.out.print("Enter choice: ");


         ch = s.nextInt();

         
         System.out.println("Output::::::");

         switch (ch) {
            case 1:
                  // FileNotFoundException
                  try {
                     File file = new File("file.txt");
                     FileReader fr = new FileReader(file);
                  } catch (FileNotFoundException e) {
                     System.out.println("FileNotFoundException caught: " + e.getMessage());
                  }               
               break;


            case 2:
                  // SQLException
                  try {
                     throw new SQLException("SQL error");
                  } catch (SQLException e) {
                     System.out.println("SQLException caught: " + e.getMessage());
                  }

                  break;

            
            case 3:
                  // ClassNotFoundException
                  try {
                     Class.forName("com.example.Example");
                  } catch (ClassNotFoundException e) {
                     System.out.println("ClassNotFoundException caught: " + e.getMessage());
                  }

                  break;

                  
            case 4:
                  // InterruptedException
            try {
               Thread.sleep(1000);
            } catch (InterruptedException e) {
               System.out.println("InterruptedException caught: " + e.getMessage());
            }

                  break;
         
            default:
               System.out.println("Enter again");
               break;
         }


         System.out.println("--------------------------------");


      }while(ch != 5);     
   }
}
