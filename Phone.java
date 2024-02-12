import java.util.ArrayList;

public class Phone {
    public static void main(String[] args) {
        permute("","12");
        ArrayList<String> ans = permuteret("","12");
        System.out.println(ans);
    }
    public static void permute(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1) * 3; i < digit * 3 ; i++) {
            char ch = (char)('a' + i);
            permute(p + ch,up.substring(1));
        }
    }
    public static ArrayList<String> permuteret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit-1) * 3; i < digit * 3 ; i++) {
            char ch = (char)('a' + i);
            ans.addAll(permuteret(p + ch,up.substring(1)));
        }
        return ans;
    }
}
