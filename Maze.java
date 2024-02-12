import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(4,4));
        path("",4,4);
        System.out.println(pathret("",3,3));
        System.out.println(pathretDiagonal("",3,3));
    }
    public static int count(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);

        return left + right;
    }
    public static void path(String p,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + "D",r-1,c);
        }
        if(c > 1) {
            path(p + "R", r, c - 1);
        }
    }
    public static ArrayList<String> pathret(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans =new ArrayList<>();

        if(r > 1){
            ans.addAll(pathret(p + "D",r-1,c));
        }
        if(c > 1) {
            ans.addAll(pathret(p + "R", r, c - 1));
        }
        return ans;
    }
    public static ArrayList<String> pathretDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans =new ArrayList<>();

        if(r > 1 && c > 1){
            ans.addAll(pathretDiagonal(p + "D",r-1,c-1));
        }
        if(r > 1){
            ans.addAll(pathretDiagonal(p + "V",r-1,c));
        }
        if(c > 1) {
            ans.addAll(pathretDiagonal(p + "H", r, c - 1));
        }
        return ans;
    }
}
