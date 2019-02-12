public class Driver{
  public static void main(String[] args) {
    String x = " solutions found\n";
    String z = "First solution found:\n\n";
    QueenBoard a = new QueenBoard(0);
      System.out.println(a.countSolutions() + x);//1
      a.solve();
      if (a.countSolutions() == 0) System.out.println(a);
      else System.out.println(z + a);
    QueenBoard b = new QueenBoard(1);
      System.out.println(b.countSolutions() + x);//1
      b.solve();
      System.out.println(z + b);
    QueenBoard c = new QueenBoard(2);
      System.out.println(c.countSolutions() + x);//0
      c.solve();
      if (c.countSolutions() == 0) System.out.println(c);
      else System.out.println(z + c);
    QueenBoard d = new QueenBoard(3);
      System.out.println(d.countSolutions() + x);//0
      d.solve();
      if (d.countSolutions() == 0) System.out.println(d);
      else System.out.println(z + d);
    QueenBoard e = new QueenBoard(4);
      System.out.println(e.countSolutions() + x);//2
      e.solve();
      System.out.println(z + e);
    QueenBoard f = new QueenBoard(5);
      System.out.println(f.countSolutions() + x);//10
      f.solve();
      System.out.println(z + f);
    QueenBoard g = new QueenBoard(6);
      System.out.println(g.countSolutions() + x);//4
      g.solve();
      System.out.println(z + g);
    QueenBoard h = new QueenBoard(7);
      System.out.println(h.countSolutions() + x);//40
      h.solve();
      System.out.println(z + h);
    QueenBoard i = new QueenBoard(8);
      System.out.println(i.countSolutions() + x);//92
      i.solve();
      System.out.println(z + i);
    QueenBoard j = new QueenBoard(9);
      System.out.println(j.countSolutions() + x); //352
      j.solve();
      System.out.println(z + j);
    QueenBoard k = new QueenBoard(10);
      System.out.println(k.countSolutions() + x);//724
      //System.out.println(k);
      k.solve();
      System.out.println(z + k);

  }
}
