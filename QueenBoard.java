public class QueenBoard{

  //Instance Variables:
    private int[][]board;

  //Constructor:
    public QueenBoard(int size){
      board = new int[size][size];
      //addQueen(0,0);
    }

  //Private methods (suggested):
    private boolean addQueen(int r, int c){
      if (board[r][c] != 0){
        return false; //only empty spaces
      }

      board[r][c] = -1; //queen

      for(int i = 1; i <board.length - c; i++){
        board[r][i+c] ++; //sqs. to the right

        //add one for threatened squares
        if(r-i >= 0){
          board[r-i][c+i] ++;
        }

        if(r+i < board.length){
          board[r + i][c + i]++;
        }
      }

      return true;
    }

    private boolean removeQueen(int r, int c){
        if (board[r][c] != -1){
          return false; //cant rm a queen if there is none
        }

        board[r][c] = 0;

        for(int i = 0; i < board.length - c; i++){
          board[r][i+c] --; //sqs. to the right

          //same as addqu but subtract 1
          if(r-i >= 0){
            board[r-i][c+i] --;
          }

          if(r+i < board.length){
            board[r + i][c + i] --;
          }
        }
        return true;
      }


  //Public Methods:
    /**
    *return The output string formatted as follows:
    *All numbers that represent queens are replaced with 'Q'
    *all others are displayed as underscores '_'
    *There are spaces between each symbol:
    *"""_ _ Q _
    *Q _ _ _

    *_ _ _ Q

    *_ Q _ _"""
    *(pythonic string notation for clarity,
    *excludes the character up to the *)
    */

    public String toString(){
      String res = "";
      for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[i].length; j++){
          if(board[i][j] == -1){
            res += "Q";
          }
          else{
            res += "_";
          }
          res+= " ";
        }
        res += "\n";
      }
      return res; //similar to wordSearch
    }

    /**
    *return false when the board is not solveable and leaves the board filled with zeros;
    true when the board is solveable, and leaves the board in a solved state
    *throws IllegalStateException when the board starts with any non-zero value
    */

    public boolean solve(){
      for (int i = 0; i < board.length; i++){
        for (int j = 0; j < board[i].length; j++){
          if (board[i][j] != 0) throw new IllegalStateException();
        }
      }
      //recursive step
      return solveHelp(0);
    }

    public boolean solveHelp(int c){
      //base case
      if(c >= board.length){
        return true;
      }

      //recursive backtracking
      for(int i =0; i < board.length; i++){ //for loop works better than the while
        if(addQueen(i, c)){
          if(solveHelp(c + 1)){
            return true; //try next col
          }
          removeQueen(i, c); //rm and try again
        }
      }
      // System.out.println(Text.go(1,1));
      // System.out.println(this);Text.wait(50); //adjust this delay
      return false; //unsolveable

    }


    /**
    *return the number of solutions found, and leaves the board filled with only 0's
    *throws IllegalStateException when the board starts with any non-zero value
    */

    public int countSolutions(){
      for (int i = 0; i < board.length; i++){
        for (int j = 0; j < board[i].length; j++){
          if (board[i][j] != 0) throw new IllegalStateException();
        }
      }

      int res = cShelp(0);
      //clear board
      for (int r = 0; r < board.length; r++){
        for (int c = 0; c < board[r].length; c++){
          board[r][c] = 0;
        }
      }

      return res;
    }


    public int cShelp(int c){
      //base case
      if(c >= board.length){
        return 1;
      }

      //recursive backtracking
      int res = 0;

      for(int i = 0; i < board.length; i++){
        if(addQueen(i, c)){
          res += cShelp(c+1);
          removeQueen(i, c);
        }
      }
      return res;
    }

    public static void main(String[] args){
      //testing purposes
      QueenBoard board = new QueenBoard(4);

      board.solve();

      board.addQueen(0,0);
      System.out.println(board);

      board.addQueen(2,0);
      System.out.println(board);

    }

}
