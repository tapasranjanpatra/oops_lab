abstract class Customer{
    private int id;
    private String name;
    private int totalBooksBorrowed;

    Customer(int id, String name, int totalBooksBorrowed)
    {
        this.id = id;
        this.name = name;
        this.totalBooksBorrowed = totalBooksBorrowed;
    }

    public abstract boolean isEnrolled();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalBooksBorrowed() {
        return totalBooksBorrowed;
    }

    public void setTotalBooksBorrowed(int totalBooksBorrowed) {
        this.totalBooksBorrowed = totalBooksBorrowed;
    }

    



}

class Student extends Customer{
    String course;

    Student(int id, String name, int totalBooksBorrowed, String course)
    {
        super(id, name, totalBooksBorrowed);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isEnrolled(){

        //TODO
// will try to get student last year
        return true;
    }





}
class Faculty extends Customer{
    String department;

    Faculty(int id, String name, int totalBooksBorrowed, String department)
    {
        super(id, name, totalBooksBorrowed);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public boolean isEnrolled(){

        //TODO
        // will try to get faculty enrollment or retirement year 

        return true;
    }

}