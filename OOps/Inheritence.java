class A{
    void callA() {
        System.out.println("This is 'A' class");
    }
}

class B extends A{
    public void callB() {
        System.out.println("This is 'B' class");
    }
}



public class Inheritence {
    public static void main(String[] args) {
        B b = new B();
        b.callA();
    }
}
