public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static boolean solve(int [][] board){
        boolean emptyLeft = true;
        int row = -1;
        int col = -1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            return true;
        }
        for (int num = 1; num <= 9 ; num++) {
            if(isSafe(board,row,col,num)){
                board[row][col] = num;
                if(solve(board)){
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }
        for (int [] arr:board) {
            if(arr[col] == num){
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int startRow = row - row%sqrt;
        int startCol = col - col%sqrt;
        for (int r = startRow; r <startRow + sqrt ; r++) {
            for (int c = startCol; c <startCol + sqrt ; c++) {
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
