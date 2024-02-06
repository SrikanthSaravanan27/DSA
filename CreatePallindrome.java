import java.util.Scanner;

public class CreatePallindrome {
    public static void main(String[] args) {
      StringBuilder str = new StringBuilder("APP");
        System.out.println(str.append(reverse(str)));
    }
    static StringBuilder reverse(StringBuilder str){
        boolean pal = false;
        int s = 0;
        int e =str.length()-1;
        StringBuilder reverse = new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse.append(str.charAt(i));
        }
        return reverse;
    }
}
