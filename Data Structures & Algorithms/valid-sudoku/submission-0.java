class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check for rows
        for(int i = 0 ; i < 9 ; i++){
            //for each row check if valid or not
            HashSet<Character> hs = new HashSet<>();
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] == '.') continue;
                if(hs.contains(board[i][j])) return false;
                hs.add(board[i][j]);
            }
        }
        //check for all columns
        for(int c = 0 ; c < 9 ; c++){
            HashSet<Character> hs = new HashSet<>();
            for(int i = 0 ; i < 9 ; i++){
                if(board[i][c] == '.') continue;
                if(hs.contains(board[i][c])) return false;
                hs.add(board[i][c]);
            }
        }
        //check for 9x9 squares
        for(int r = 0 ; r < 9 ; r += 3){
            for(int c = 0 ; c < 9 ; c += 3){
                int er = r + 3;
                int ec = c + 3;
                Set<Character> hs = new HashSet<>();
                for(int i = r ; i < er ; i++){
                    for(int j = c ; j < ec ; j++){
                        if(board[i][j] == '.') continue;
                        if(hs.contains(board[i][j])) return false;
                        hs.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}
