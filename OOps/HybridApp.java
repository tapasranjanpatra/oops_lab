


class HumanBody
{
   public void displayHuman()
   {
     System.out.println("Method defined inside HumanBody class");
   }
}
interface Male
{
 public void dance();
}
interface Female
{
 public void dance();
}
 
// Single Inheritance is the relationship between Child // class and HumanBody class.
// Implementing Male and Female interface is Multiple // Inheritance
class Child extends HumanBody implements Male, Female
{
 public void dance()
 {
   System.out.println("Dancing....");
 }  
 
 public void displayChild()
 {
   System.out.println("I am the child");
 }

}

public class HybridApp {
    public static void main(String[]args)
    {
      Child obj = new Child();
      obj.dance();
      obj.displayChild();
    }
}
