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
class B extends A {
    int b1;
    private int b2;
    protected int b3;
    public int b4;

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
class C extends A {
    int c1;
    private int c2;
    protected int c3;
    public int c4;

    void methodC1(){
        System.out.println("This is method C1");
    }
    private void methodC2(){
        System.out.println("This is method C2");
    }
    protected void methodC3(){
        System.out.println("This is method C3");
    }

    public void methodC4(){
        System.out.println("This is method C4");
    }
}
public class Hybrid extends B {
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();

		a.methodA1();
        //a.methodA2();
        a.methodA3();
        a.methodA4();
        System.out.println(a.a1);
        //System.out.println(a.a2);
        System.out.println(a.a3);
        System.out.println(a.a4);


        b.methodB1();
        //b.methodB2();
        b.methodB3();
        b.methodB4();
        System.out.println(b.b1);
        //System.out.println(b.b2);
        System.out.println(b.b3);
        System.out.println(b.b4);
        

        c.methodC1();
        //c.methodC2();
        c.methodC3();
        c.methodC4();
        System.out.println(c.c1);
        //System.out.println(c.c2);
        System.out.println(c.c3);
        System.out.println(c.c4);

	}
}

