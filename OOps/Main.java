
import java.util.*;

class Pen
{


    private void write() {
        System.out.println("write");
    }
    public void name() {
        System.out.println("called");
        write();
    }
}



public class Main
{
    public static void main(String[] args) {
        Pen p = new Pen();
        p.name();
        p.write();
    }
}
