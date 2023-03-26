
class A {
    int a1;
    private int a2;
    protected int a3;
    public int a4;
	void print_A1() { System.out.println("Class A1"); }
    private void print_A2() { System.out.println("Class A2"); }
    protected void print_A3() { System.out.println("Class A3"); }
    public void print_A4() { System.out.println("Class A4"); }
}

class B extends A {
    int b1;
    private int b2;
    protected int b3;
    public int b4;
	void print_B1() { System.out.println("Class B1"); }
    private void print_B2() { System.out.println("Class B2"); }
    protected void print_B3() { System.out.println("Class B3"); }
    public void print_B4() { System.out.println("Class B4"); }
}

class C extends A {
    int c1;
    private int c2;
    protected int c3;
    public int c4;
	void print_C1() { System.out.println("Class C1"); }
    private void print_C2() { System.out.println("Class C2"); }
    protected void print_C3() { System.out.println("Class C3"); }
    public void print_C4() { System.out.println("Class C4"); }
}

class D extends A {
    int d1;
    private int d2;
    protected int d3;
    public int d4;
	void print_D1() { System.out.println("Class D1"); }
    private void print_D2() { System.out.println("Class D2"); }
    protected void print_D3() { System.out.println("Class D3"); }
    public void print_D4() { System.out.println("Class D4"); }
}

public class Hierarchical {
	public static void main(String[] args)
	{
		B obj_B = new B();
		obj_B.print_A1();
        //obj_B.print_A2();
        obj_B.print_A3();
        obj_B.print_A4();
        obj_B.print_B1();
		//obj_B.print_B2();
        obj_B.print_B3();
        obj_B.print_B4();

		C obj_C = new C();
		obj_C.print_A1();
        //obj_C.print_A2();
        obj_C.print_A3();
        obj_C.print_A4();
        obj_C.print_C1();
		//obj_C.print_C2();
        obj_C.print_C3();
        obj_C.print_C4();

		D obj_D = new D();
		obj_D.print_A1();
        //obj_D.print_A2();
        obj_D.print_A3();
        obj_D.print_A4();
        obj_D.print_D1();
		//obj_D.print_D2();
        obj_D.print_D3();
        obj_D.print_D4();
	}
}
