import static java.lang.System.*;

public class Ex17 {
  public static void main(String[] args) {
    // String[] words = new String[] {"COVID", "19", "OMG", "!!!"};
    // for (String word: words) { out.println(word); }
    Stringy[] stringies = new Stringy[1]; // { new Stringy("stringy"), }
    stringies[0] = new Stringy("stringy zero");
    out.println("len of stringies = " + stringies.length);

  }
}

class Stringy {
  Stringy(String str) { out.println("CONSTRUCTOR of: " + str); }

}
