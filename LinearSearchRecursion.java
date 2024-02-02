import java.util.ArrayList;


public class LinearSearchRecursion {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] arr = {1,2,3,4,4,5};
        System.out.println(linearSearch(arr, 4, 0));
        linearSearchAllIndex(arr, 4, 0,list);
        System.out.println(list.toString());
    }
    public static int linearSearch(int [] arr,int target,int index){
        if(index > arr.length-1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }

        return linearSearch(arr, target, index+1);
    }
 
    public static ArrayList<Integer> linearSearchAllIndex(int [] arr,int target,int index,ArrayList<Integer> list){
        if(index > arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return linearSearchAllIndex(arr, target, index+1,list);
    }
}
