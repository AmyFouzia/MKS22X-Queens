public class QueenBoard{

  //Instance Variables:
    private int[][]board;

  //Constructor:
    public QueenBoard(int size){
      board = new int[size][size];
    }

  //Private methods (suggested):
    private boolean addQueen(int r, int c){
      if (board[r][c] != 0){
        return false; //only empty spaces
      }

      board[r][c] = -1; //queen

      for(int i = 0; i <board.length - c; i++){
        board[r][i+c] ++; //sqs. to the right

        if(){

        }

        if(){

        }
      }

      return true;
    }

    private boolean removeQueen(int r, int c){
        if (board[r][c] != -1){
          return false; //cant rm a queen if there is none
        }

        board[r][c] = 0;

        for(int i =0; i < board.length - c; i++){

          if(){

          }
          if(){

          }
        }
        return true;
      }

      return false;
    }

    private boolean isThreatened(){

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
        res += "\n"
      }
      return res; //similar to wordSearch
    }

    /**
    *return false when the board is not solveable and leaves the board filled with zeros;
    true when the board is solveable, and leaves the board in a solved state
    *throws IllegalStateException when the board starts with any non-zero value
    */

    public boolean solve(){

    }

    public boolean solveHelp(int){

    }

    /**
    *return the number of solutions found, and leaves the board filled with only 0's
    *throws IllegalStateException when the board starts with any non-zero value
    */

    public int countSolutions(){

    }

    public int countSolutions(int){

    }

}
