import java.util.Scanner;

public class Xpattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int start = 0;
        int end = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(j == start){
                    System.out.print(str.charAt(j));
                } else if (j == end) {
                    System.out.print(str.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            start++;
            end--;
        }
    }
}
