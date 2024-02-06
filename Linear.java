import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int [] arr = new int [5];
        System.out.println("Enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element to be founnd:");
        int target = in.nextInt();
        int result =linearSearch(arr,target);
        if(result == -1){
           System.out.println("Element not found");
        }
        else{
            System.out.println("Element Found at index:"+result);
        }
    }
    static int linearSearch(int [] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}