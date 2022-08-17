package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class WeekDays {

    public static int maxLetters(String... arr){
        int max=Integer.MIN_VALUE;
        for (String day: arr){
            if(day.length()>max){
                max=day.length();
            }
        }
        return max;
    }

//    private static List<String> reverse(String[] arr) {
//        List<String> revday= new ArrayList<>();
//        for(String day: arr){
//            StringBuilder days = new StringBuilder();
//            StringBuilder dayss = days.append(day);
//            String rev= String.valueOf(dayss.reverse());
//            revday.add(rev);
//        }
//        return revday;
//    }

    private static  List<String> reverse(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<>();
         for(String day: arr){
             String str=" ";
             for(int i= day.length()-1;i>=0;i--){
                  char ch=day.charAt(i);
                  str = str + ch;
             }
             arrayList.add(str);
         }
         return arrayList;
    }

    public static void main(String[] args) {
        String[] arr={"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        System.out.println(WeekDays.maxLetters(arr));
        System.out.println(WeekDays.reverse(arr));

//        WeekDays.reverse(arr);
    }


}
