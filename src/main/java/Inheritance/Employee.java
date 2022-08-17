package Inheritance;

public class Employee extends Person {

    private String title;
    private  String employer;
    private String empoyeeGrade;
    private int salary;

    public  Employee(){

    };

    public Employee(String name, int phone, String email, String title, String employer, String empoyeeGrade, int salary) {
        super(name, phone, email);
        this.title = title;
        this.employer = employer;
        this.empoyeeGrade = empoyeeGrade;
        this.salary = salary;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmpoyeeGrade() {
        return empoyeeGrade;
    }

    public void setEmpoyeeGrade(String empoyeeGrade) {
        this.empoyeeGrade = empoyeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", empoyeeGrade='" + empoyeeGrade + '\'' +
                ", salary=" + salary +
                ", phone=" + super.getPhone() +
                ", email=" + super.getEmail() +
                '}';
    }
}

