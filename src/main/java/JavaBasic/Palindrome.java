package JavaBasic;

public class Palindrome {

    public static boolean check(String str) {
        int i = 0;
        int j = str.length() -1;
        boolean flag=false;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                flag = true;
                i++;
                j--;
            }
            else flag=false;
            i++;
            j--;

        }
        return flag;
    }
    public static void main(String[] args) {

            String st="abaab";
            Palindrome P=new Palindrome();

        System.out.println(P.check(st));
    }
}
