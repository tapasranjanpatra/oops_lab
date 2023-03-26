class Dog{
    int age;
    String name;

    public void bark()
    {
        System.out.println(name + " Bow Bow Bow....");
    }
    public void sleep()
    {
        System.out.println(name + " Sleeping....");
    }

    Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

}


public class ClassnObjectApp {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jack", 10);
        d1.bark();
        Dog d2 = new Dog("Sheruu", 2);
        d2.sleep();
    }
}
