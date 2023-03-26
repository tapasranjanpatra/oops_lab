class Vehicle {
    private int engineNo = 2877; 
    protected int wheels;
    public int price = 803332;
    public Vehicle(int wheels){
        this.wheels = wheels;
    }


    public void type(){
        System.out.println("Car have " + wheels + " wheels.");
    }
}

class Car extends Vehicle{
    public Car(int wheels){
        super(wheels);
    }
    
    public void drive() {
        System.out.println("Car is driving");
    }
}



public class SingleApp {
    public static void main(String[] args) {

        Car c = new Car(4);
        //System.out.println("Engine Number: " + c.engineNo);
        System.out.println("Price: " + c.price);
        c.type();
        c.drive();
        
    }
}
