
import java.util.Scanner;

class A {
    
    void m1() {
        System.out.println("A method");
    }
}

class B extends A {
    B(){
        super();
    }
    @Override
    void m1() {
        System.out.println("B method");
    }
}

public class Test1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.m1();
    }
}
