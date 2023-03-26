class ResultException  extends Exception  
{  
    public ResultException (String str)  
    {  
        super(str);  
    }  
}  
    
public class UserExcp  
{  
   
    static void result (int score) throws ResultException{    
        if(score < 33) {  
            throw new ResultException("You scored below 33% so you are fail.");    
        }  
        else {   
            System.out.println("Passed with flying colours.");   
        }  
    }     
    public static void main(String args[])  
    {  
        try {
            int x = 10/0;
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("hello");
    }  
}  