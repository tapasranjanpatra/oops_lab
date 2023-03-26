import java.util.Scanner;

public class UncheckedExcp {
    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       int ch = 0;

       do{
          System.out.println("Enter the exception you want to check: ");
          System.out.println("1. NullPointerException");
          System.out.println("2. ArithmeticException");
          System.out.println("3. ArrayIndexOutOfBoundsException");
          System.out.println("4. NumberFormatException");
          System.out.println("5. ClassCastException");
          System.out.println("6. Exit");
          System.out.print("Enter choice: ");
 
 
          ch = s.nextInt();
 
          
          System.out.println("Output::::::");
 
          switch (ch) {
            case 1:
                     try {
                        // NullPointerException
                        String str = null;
                        System.out.println(str.length());
                     } catch (NullPointerException e) {
                        System.out.println("NullPointerException caught: " + e.getMessage());
                     }
                     break;

            case 2:
                     try {
                        // ArithmeticException
                        int a = 10, b = 0;
                        System.out.println(a / b);
                     } catch (ArithmeticException e) {
                        System.out.println("ArithmeticException caught: " + e.getMessage());
                     }
                     break;

            case 3:
                     try {
                        // ArrayIndexOutOfBoundsException
                        int[] arr = {1, 2, 3};
                        System.out.println(arr[3]);
                     } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
                     }
                     break;
            case 4:
                     try {
                        // NumberFormatException
                        String num = "abc";
                        Integer.parseInt(num);
                     } catch (NumberFormatException e) {
                        System.out.println("NumberFormatException caught: " + e.getMessage());
                     }
                     break;
            case 5:
                     try {
                        // ClassCastException
                        Object obj = new Object();
                        String st = (String) obj;
                     } catch (ClassCastException e) {
                        System.out.println("ClassCastException caught: " + e.getMessage());
                     }
                     break;
            default:
                     System.out.println("Enter again");
                     break;
    }

    System.out.println("--------------------------------");
 }while(ch!=6);

}
 
}
 