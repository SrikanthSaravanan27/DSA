import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShibuGame {
    public static void main(String[] args) {
    ArrayList<Integer> player1 = new ArrayList<>();
    ArrayList<Integer> player2 = new ArrayList<>();

    for(int i=0;i<5;i++){
        player1.add((int) (Math.random() * (20 - 1) + 1));
        player2.add((int) (Math.random() * (20 - 1) + 1));
    }
    int con = 0;
    Scanner in =new Scanner(System.in);
    while (con != -1 && player1.size() >=0  && player2.size() >= 0) {
        if(player1.size() == 0){
            System.out.println("player1 won");
            break;
        }
        if(player2.size() == 0){
            System.out.println("player2 won");
            break;
        }
         System.out.println(player1.toString());
         System.out.println(player2.toString());
         System.out.println("to  continue play enter 1 else -1");
//         con = in.nextInt();
         int randomNumber = (int) (Math.random() * (20 - 1) + 1);

         int index1 = linearSearch(player1, randomNumber, 0);
         int index2 = linearSearch(player2, randomNumber, 0);
         System.out.println("Number " + randomNumber);
         if(index1 != -1){
             player1.remove(index1);
         }
         if(index2 != -1){
            player2.remove(index2);
         }
    }
    }
    public static int linearSearch(ArrayList<Integer> arr,int target,int index){
        if(index > arr.size()-1){
            return -1;
        }
        if(arr.get(index) == target){
            return index;
        }

        return linearSearch(arr, target, index+1);
    }
}