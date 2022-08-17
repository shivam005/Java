package ObjectComposition;

public class LibRunner {

    public static void main(String[] args) {

        Book bk=new Book(1,"on tree", "anonymous");
        Reviews rv= new Reviews(2,"nothing", (float) 4.2);
        System.out.println(bk);
        System.out.println(rv);
        Library lb = new Library(bk,rv);
        System.out.println(lb);
    }
}
