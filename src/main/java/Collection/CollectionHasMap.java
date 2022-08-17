package Collection;

import java.util.HashMap;

public class CollectionHasMap {



    public static void main(String[] args) {
        String sa= "This is a great thing";
        String st=sa.toLowerCase();
        HashMap<Character, Integer> HM;
        HM = new HashMap<>();

//        String[] str= sa.split(" ");
//        This if for storing the list of words for checking their occurance.
        char[] arr=st.toCharArray();
        for(Character ch: arr){
            /*Get the character
            * if it is there, we increment the count
            * if it is not there then, initialize to 1
            * */
             Integer count= HM.get(ch);
             if(count==null){
                 HM.put(ch, 1);
             }
             else{
                 HM.put(ch, count+1);
             }
        }

        System.out.println(HM);





        }
    }

