interface A {
    int a1=0;
    // private int a2;
    // protected int a3;                     Only static public modifiers we can write
    public int a4=0;

    void methodA1();
    
    // private void methodA2();
    // protected void methodA3();

    public void methodA4();
}

interface B {
    int b1=0;
    //private int b2;
    //protected int b3;
    public int b4=0;

    void methodB1();
    
    // private void methodB2();
    // protected void methodB3();

    public void methodB4();
}

class Child implements A,B {
    @Override
    public void methodA1() {
        System.out.println("This is method A1");
    }

    @Override
    public void methodA4() {
        System.out.println("This is method A4");
    }

    @Override
    public void methodB1() {
        System.out.println("This is method B1");
    }

    @Override
    public void methodB4() {
        System.out.println("This is method B4");
    }

}

// Drived class
public class Multiple {
	public static void main(String[] args)
	{
		Child c = new Child();
		c.methodA1();
        c.methodA4();
        c.methodB1();
        c.methodB4();
	}
}
