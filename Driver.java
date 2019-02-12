public class Driver{
  public static void main(String[] args) {
    QueenBoard board1 = new QueenBoard(1);
    QueenBoard board2 = new QueenBoard(2);
    QueenBoard board3 = new QueenBoard(3);
    QueenBoard board4 = new QueenBoard(4);
    QueenBoard board5 = new QueenBoard(5);
    QueenBoard board6 = new QueenBoard(6);
    QueenBoard board7 = new QueenBoard(7);
    QueenBoard board8 = new QueenBoard(8);

    System.out.println("");


    System.out.println("");

    System.out.println(board4);//should print 4x4 board

    System.out.println("");

    board1.solve();
    System.out.println(board1);
    System.out.println("");

    board2.solve();
    System.out.println(board2);
    System.out.println("");

    board3.solve();
    System.out.println(board3);
    System.out.println("");

    board4.solve();
    System.out.println(board4);
    System.out.println("");

    board5.solve();
    System.out.println(board5);
    System.out.println("");

    board6.solve();
    System.out.println(board6);
    System.out.println("");

    board7.solve();
    System.out.println(board7);
    System.out.println("");

    board8.solve();
    System.out.println(board8);
    System.out.println("");


    //testing out count
    try {
      System.out.println(board8.countSolutions());
    }
    catch (IllegalStateException e){
      System.out.println("board is not empty");
    }

    System.out.println("");
    System.out.println("");

    board1.clear();
    board2.clear();
    board3.clear();
    board4.clear();
    board5.clear();
    board6.clear();
    board7.clear();
    board8.clear();

    System.out.println(board1.countSolutions());//1
    System.out.println(board2.countSolutions());//0
    System.out.println(board3.countSolutions());//0
    System.out.println(board4.countSolutions());//2
    System.out.println(board5.countSolutions());//10
    System.out.println(board6.countSolutions());//4
    System.out.println(board7.countSolutions());//40
    System.out.println(board8.countSolutions());//92


  }
}
