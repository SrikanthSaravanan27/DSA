import java.util.Scanner;

public class NumStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str;
        in.nextLine();
        str = in.nextLine();
        System.out.println(fn(n,str));
        System.out.println(Con(n,str));
        System.out.println(odd(n,str));
        System.out.println(even(n,str));
        System.out.println(firstTwo(n,str));
        System.out.println(lastTwo(n,str));
    }
    public static String fn(int n,String s){
        String nums = "" + n;
        String ans = "";
        int i = 0;
        int j = 0;

        while(i<nums.length() && j<s.length()){
            ans = ans + nums.charAt(i);
            i++;
            ans = ans + s.charAt(j);
            j++;
        }
        while(i<nums.length()){
            ans = ans + nums.charAt(i);
            i++;
        }
        while(j<s.length()){
            ans = ans + s.charAt(j);
            j++;
        }
        return ans;
    }
    public static String Con(int n,String s){
        String nums = "" + n;
        return nums + s;
    }

    public static String odd(int n ,String s){
        String nums = "" + n;
        String ans = "";
        int i = 0;
        int j = 0;
        while(i<nums.length()){
            if((int)nums.charAt(i) % 2 != 0){
                ans = ans + nums.charAt(i);
            }
            i++;
        }
        while(j<s.length()){
            if(j % 2 != 0){
                ans = ans + s.charAt(j);
            }
            j++;
        }
        return ans;
    }
    public static String even(int n ,String s){
        String nums = "" + n;
        String ans = "";
        int i = 0;
        int j = 0;
        while(i<nums.length()){
            if((int)nums.charAt(i) % 2 == 0){
                ans = ans + nums.charAt(i);
            }
            i++;
        }
        while(j<s.length()){
            if(j % 2 == 0){
                ans = ans + s.charAt(j);
            }
            j++;
        }
        return ans;
    }
    public static String firstTwo(int n,String s){
        String nums = "" + n;
        String ans = "";
        int i = 0;
        int j = 0;
        while(i<2){
            ans = ans + nums.charAt(i);
            i++;
        }
        while(j<2){
            ans = ans + s.charAt(j);
            j++;
        }
        return ans;
    }
    public static String lastTwo(int n,String s){
        String nums = "" + n;
        String ans = "";
        int i = nums.length()-2;
        int j = s.length()-2;
        while(i<nums.length()){
            ans = ans + nums.charAt(i);
            i++;
        }
        while(j<s.length()){
            ans = ans + s.charAt(j);
            j++;
        }
        return ans;
    }
}
