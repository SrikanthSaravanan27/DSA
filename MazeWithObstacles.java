public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean [][] map = {
                {true,true,false},
                {true,true,true},
                {true,true,true}
        };
        pathRestrictions("",map,0,0);
    }
    public static void pathRestrictions(String p,boolean [][] flag,int r,int c){
        if(r == flag.length-1 && c == flag[r].length-1){
            System.out.println(p);
            return;
        }
        if(!flag[r][c]){
           return;
        }
        if(r < flag.length-1){
            pathRestrictions(p + "D",flag,r+1,c);
        }
        if(c < flag[r].length-1){
            pathRestrictions(p + "R",flag,r,c+1);
        }
    }
}
