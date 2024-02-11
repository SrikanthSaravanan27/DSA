import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutation("","abc");
        ArrayList<String> ans = permutationlist("","abc");
        System.out.println(ans);
    }
    public static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());

            permutation(f+ch+l,up.substring(1));
        }
    }
    public static ArrayList<String> permutationlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());

            ans.addAll(permutationlist(f+ch+l,up.substring(1)));
        }
        return ans;
    }
}
