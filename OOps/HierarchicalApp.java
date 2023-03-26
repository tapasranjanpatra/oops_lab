class GrandFather{    
    public void showG()    {    
        System.out.println("He is grandfather.");    
    }    
} 

class Father extends GrandFather{    
    public void showF(){    
        System.out.println("He is father.");    
    }    
}       

class Son extends Father{    
    public void showS(){    
        System.out.println("He is son.");    
    }    
}       
public class HierarchicalApp extends Father{    
    public void showD(){    
        System.out.println("She is daughter.");    
    }    
    public static void main(String args[])    
    {    
        Son obj = new Son();  
        obj.showS(); 
        obj.showF(); 
        obj.showG(); 
        HierarchicalApp obj2 = new HierarchicalApp();  
        obj2.showD();   
        obj2.showF();   
        obj2.showG();   
    }    
}  