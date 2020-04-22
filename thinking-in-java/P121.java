import static java.lang.System.*;

class Book {
  boolean checkedOut = false;
  Book(boolean checkOut) { checkedOut = checkOut; }
  void checkIn() { checkedOut = false; }
  protected void finalize() {
    if (checkedOut) { out.println("ERROR: checked out"); }
  }
}

public class P121 { // TerminationCondition
  public static void main(String[] args) {
    Book novel = new Book(true);
    novel.checkIn();
    new Book(true);
    System.gc();
  }
}
