class A {
    void m1()
    {
        System.out.println("Method1");
    }
    public void m2()
    {
        System.out.println("Method2");
    }
    private void m3()
    {
        System.out.println("Method3");
    }
    protected void m4()
    {
        System.out.println("Method4");
    }
}


public class ClassnObject{
    public static void main(String[] args) {
        A d  = new A();

        d.m1();
        d.m2();
        //d.m3();
        d.m4();


    }
}