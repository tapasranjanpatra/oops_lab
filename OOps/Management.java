class Members{
    int id;
    String name;

        public Members(int id, String name){
            this.id = id;
            this.name = name;
        }

}


class Staff extends Members{
    
    int salary;

        public Staff(int id, String name, int salary){
            super(id,name);
            this.salary = salary;
            this.id = id;
            this.name = name;
    }
}

class Teaching extends Staff{
    String courseTeach;
    String skills;

        public Teaching(int id, String name, int salary,  String courseTeach, String skills) {
            super(id, name,salary);
            this.courseTeach = courseTeach;
            this.skills = skills;
    }
}

class NonTeaching extends Staff{
    String job;
    String department;

        public NonTeaching(int salary, int id, String name, String job, String department) {
            super(id, name,salary);
            this.job = job;
            this.department = department;
    }
}


class Student extends Members{
    int marks;
    String course;

        public Student(int id, String name, int marks, String course) {
            super(id, name);
            this.marks = marks;
            this.course = course;
    }
}

class Research extends Student{
    String field;
    public Research(int id, String name,  int marks, String course, String field) {
        super(id, name,marks,course);
        this.field = field;
    }

    public void test(){
        System.out.println("Name: " + name + "\nId: " + id + "\nMarks: " + marks + "\nCourse: " + course + "\nField: " + field);
    }

}

class Pg extends Student{
    int year;
    public Pg(int id, String name,  int marks, String course, String field, int year) {
        super(id,name,marks,course);
        this.year = year;
    }
}


public class Management {
    public static void main(String[] args) {

        Research r1 = new Research(1, "Saiful", 50, "MCA", "Computer");
        r1.test();
        
    }
}
