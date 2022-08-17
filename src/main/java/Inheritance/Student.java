package Inheritance;

public class Student extends  Person{

    private  String college;
    private String Class;

    public  Student(){};

    public Student(String college, String aClass) {
        super();
        this.college = college;
        Class = aClass;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }



    public void setClass(String aClass) {
        Class = aClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "college='" + college + '\'' +
                ", Class='" + Class + '\'' +
                '}';
    }
}
