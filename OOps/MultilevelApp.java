class Company {
    String name;
    String work;

    Company(String name, String work){
        this.name = name;
        this.work = work;
    }

    protected void workDone(){
        System.out.println("We do "+ work);
    }

}

class BoardMembers extends Company{
    protected int boardMembers;

    BoardMembers(String name, String work, int boardMembers){
        super(name,work);
        this.boardMembers = boardMembers;
    }

    protected void countMembers() {
        System.out.println("There are " + boardMembers + " board members.");
    }

}

class Employee extends BoardMembers{
    protected int employee;

    Employee(String name, String work, int boardMembers, int employee){
        super(name, work, boardMembers);
        this.employee = employee;
    }

    protected void countEmp() {
        System.out.println("There are " + employee + " employees.");
    }

}



public class MultilevelApp {
    public static void main(String[] args) {

        Employee e = new Employee("Meta","Social Networking",2,100000);
        e.countEmp();
        e.countMembers();
    }
}
