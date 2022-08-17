package Inheritance;
/*
 * Parametrized contructor is just meant for providing the value of variables via parameter or if we
 * want to have the compulory parameter while creating object.
 * If we are about to set value using getters and setters and there is nothing compulsory then
 *  it is of no use to make the parametrized contructor. In this situation, default constructor is suffice.
 *
 * toString() method plays very important role as whenever we call print() method,
 * it takes the argument post passing it using valueOf() which internally uses toString()
 * Hence, when we override toString() it affects the print() and ultimately, we get overiden
 * result.
 * */

/*
* In case of inheritance, whenever we invoke the constructor of child class, it automatically
* invokes the constructor of parent class implicitly. Hence, it is compulsory to have the
* default constructor in the parent class as well.If it doesnot find it there in the parent class then
* it will check for paremetrized constructor and will ask us to call it using super() but if
* parametrized constructor is also not there then it will call the default constructor, created by JVM
* */

public class Runner {


    public static void main(String[] args) {
        Employee em =new Employee();
        Person pr=new Person();
        Student st=new Student();
        em.setEmployer("baba pvt ltd");
        em.setEmpoyeeGrade("Y");
        em.setSalary(24000);
        em.setEmail("ladka@baba.com");
        em.setPhone(1371);
        em.setTitle("Mr.");
        System.out.println(em);
        System.out.println(pr);
        System.out.println(st);

        /*
         * Parametrized contructor is just meant for providing the value of variables via parameter or if we
         * want to have the compulory parameter while creating object.
         * If we are about to set value using getters and setters and there is nothing compulsory then
         *  it is of no use to make the parametrized contructor. In this situation, default constructor is suffice.
         *
         * toString() method plays very important role as whenever we call print() method,
         * it takes the argument post passing it using valueOf() which internally uses toString()
         * Hence, when we override toString() it affects the print() and ultimately, we get overiden
         * result
         * */

        /*
         * In case of inheritance, whenever we invoke the constructor of child class, it automatically
         * invokes the constructor of parent class implicitly. Hence, it is compulsory to have the
         * default constructor in the parent class as well.If it doesnot find it there in the parent class then
         * it will check for paremetrized constructor and will ask us to call it using super() but if
         * parametrized constructor is also not there then it will call the default constructor, created by JVM
         * */

    }


}
