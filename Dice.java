import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        match("",4);
        System.out.println(matchret("",4));
    }
    public static void match(String p,int target){
        if(target == 0 ){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6 && i<=target; i++){
            match(p+i,target-i);
        }

    }
    public static ArrayList<String> matchret(String p, int target){
        if(target == 0 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        for(int i=1; i<=6 && i<=target; i++){
            ans.addAll(matchret(p+i,target-i));
        }
        return ans;
    }
}
