import java.util.Arrays;

public class MazeAllDirections {
    public static void main(String[] args) {
        boolean [][] map = {{true,true,true},{true,true,true},{true,true,true}};

//        allpath("",0,0,map);
        int [][] path = {{0,0,0},{0,0,0},{0,0,0}};
        allpathMat("",0,0,map,path,1);
    }
    public static void allpath(String p,int r,int c,boolean [][] visited){
        if (r == visited.length-1 && c == visited[0].length-1){
            System.out.println(p);
            return;
        }
        if (!visited[r][c]){
            return;
        }
        visited[r][c] = false;


        if(r < visited.length-1){
            allpath(p+"D",r+1,c,visited);
        }
        if (c < visited[0].length-1){
            allpath(p+"R",r,c+1,visited);
        }
        if(r > 0){
            allpath(p + "U",r-1,c,visited);
        }
        if(c > 0){
            allpath(p + "L",r,c-1,visited);
        }
        visited[r][c] = true;
    }
    public static void allpathMat(String p,int r,int c,boolean [][] visited,int [][] path,int step){
        if (r == visited.length-1 && c == visited[0].length-1){
            path[r][c] = step;
            for (int [] arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if (!visited[r][c]){
            return;
        }
        visited[r][c] = false;
        path[r][c] = step;


        if(r < visited.length-1){
            allpathMat(p+"D",r+1,c,visited,path,step+1);
        }
        if (c < visited[0].length-1){
            allpathMat(p+"R",r,c+1,visited,path,step+1);
        }
        if(r > 0){
            allpathMat(p + "U",r-1,c,visited,path,step+1);
        }
        if(c > 0){
            allpathMat(p + "L",r,c-1,visited,path,step+1);
        }
        visited[r][c] = true;
        path[r][c] = 0;
    }
}
