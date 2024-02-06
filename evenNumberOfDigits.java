import java.util.Scanner;

public class evenNumberOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int [5];
        int count =0;
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
            String str= "" + arr[i];
            if(str.length() % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(byCountingNumbers(arr));
    }
    static int byCountingNumbers(int []arr){
        int sum = 0,i=0;
        while(i< arr.length){
            if(iseven(arr[i])){
                sum++;
            }
            i++;
        }
        return sum;
    }
    static boolean iseven(int num){
        int digit=0;
        while(num>0){
            digit++;
            num = num/10;
        }
        return(digit%2 == 0);
    }

}
