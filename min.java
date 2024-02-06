import java.util.Scanner;

public class Training {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int [] arr = {6,3,7,1};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}
