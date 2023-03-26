class A {
    int a1;
    private int a2;
    protected int a3;
    public int a4;

    void methodA1(){
        System.out.println("This is method A1");
    }
    private void methodA2(){
        System.out.println("This is method A2");
    }
    protected void methodA3(){
        System.out.println("This is method A3");
    }

    public void methodA4(){
        System.out.println("This is method A4");
    }
}

class B extends A{
    int b1 = 1; 
    private int b2 = 2;
    protected int b3 = 3;
    public int b4 = 4;

    void methodB1(){
        System.out.println("This is method B1");
    }
    private void methodB2(){
        System.out.println("This is method B2");
    }
    protected void methodB3(){
        System.out.println("This is method B3");
    }

    public void methodB4(){
        System.out.println("This is method B4");
    }
}



public class Single {
    public static void main(String[] args) {

        B b = new B();
        System.out.println(b.b1);
        //System.out.println(b.b2);
        System.out.println(b.b3);
        System.out.println(b.b4);

        b.methodA1();
        // b.methodA2();
        b.methodA3();
        b.methodA4();
        b.methodB1();
        //b.methodB2();
        b.methodB3();
        b.methodB4();
        
    }
}
