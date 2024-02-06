import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        List<List<Integer>> ans = subSetWithDuplicate(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int n : arr) {
            int size = outer.size();
            for(int i = 0; i < size;i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(n);
                outer.add(inner);
            }
        }
        return outer;
    }
    public static List<List<Integer>> subSetWithDuplicate(int [] arr){
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length;i++) {
            start = 0;
            if(i-1 > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int size = outer.size();
            for(int j = start; j < size;j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
