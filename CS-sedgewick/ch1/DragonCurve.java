

public class DragonCurve {
  private String letters = null;
  private int order;

  public DragonCurve(int order) {
    this.order = order;
  }

  public int getOrder() { return this.order; }

  @Override
  public String toString() {
    if (letters == null) { letters = setLetters(order); }
    return letters;
  }

  private String setLetters(int ord) {
    if (ord == 0) { return letters = "F"; }
    else {
      StringBuilder s1 = new StringBuilder(setLetters(--ord));
      return s1.toString() + 'L' + s1.reverse().toString().replace('L', 'r').replace('R', 'L').replace('r', 'R');
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      DragonCurve dc = new DragonCurve(i);
      System.out.println(dc.toString() + dc.order);
    }
  }
}
