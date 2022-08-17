package Generics;

public class Runner {


    public static void main(String[] args) {

        CustomList<String> list= new CustomList<>();
        list.add("baba");
        list.add("baba1");
        list.add("baba");
        list.remove("baba");
        System.out.println( list.get(0));
        System.out.println(list);

        CustomList<Integer> list1=new CustomList<>();
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.remove(1);

        System.out.println(list1);




    }

}
