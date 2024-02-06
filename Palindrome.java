import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(isPallindrome(str));
    }
    static boolean isPallindrome(String str){
        boolean pal = false;
        int s = 0;
        int e =str.length()-1;
        while(s<e){
            if(str.charAt(s) != str.charAt(e)){
                pal = false;
                return pal;
            }
            else{
                pal = true;
            }
            s++;
            e--;
        }
        return pal;
    }
}
