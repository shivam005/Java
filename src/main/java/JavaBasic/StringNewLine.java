package JavaBasic;

public class StringNewLine {

    static String str="I am the java programmer";

    public static void main(String[] args) {
         for(int i=0; i<str.length();i++){
                char ch = str.charAt(i);
                if(!Character.isWhitespace(str.charAt(i))){
                    System.out.println(str.charAt(i));
        }
         }
    }
    }

