public class NQueen {
    public static void main(String[] args) {
        int n = 8;
        boolean [][] board = new boolean[n][n];
        System.out.println(placeQueen(board,0));
    }
    public static int placeQueen(boolean [][] board,int r){
        if(r == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int i=0;i < board.length;i++){
            if(isSafe(board,r,i)){
                board[r][i] = true;
                count = count + placeQueen(board, r+1);
                board[r][i] = false;
            }
        }
        return count;
    }

    private static void display(boolean[][] board) {
        for (boolean [] a:board) {
            for (boolean flag:a) {
                if(flag == true){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean [][] board,int r,int c) {
        for (int i = 0; i < r; i++) {
            if(board[i][c]){
                return false;
            }
        }
        int maxLeft = Math.min(r,c);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[r-i][c-i]){
                return false;
            }
        }
        int maxRight = Math.min(r, board.length - c -1) ;
        for (int i = 1; i <= maxRight; i++) {
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
}
