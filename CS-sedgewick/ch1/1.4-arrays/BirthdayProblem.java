// 1.4.38
// Call with one paramenter, which is the number of parties to simulate.
// calling with n = 5000 consistently gives the right answer, 23.0.

import static java.lang.System.out;
import  java.util.Random;

public class BirthdayProblem {
  private final int DaysPerYear = 365;
  private Random r = new Random();
  private int numberOfSims;
  private int[] conflicts;

  protected BirthdayProblem(int x) {
    numberOfSims = x;
    conflicts = new int[ numberOfSims ];
    for(int i = 0; i < numberOfSims; ++i) {
      conflicts[i] = this.haveParty();
    }
    for(int conflict : conflicts) {
      out.print(conflict + ", ");
    }
    out.println("\naverage=" + this.averagePartySize());
  }

  private double averagePartySize() {
    int sum = 0;
    for(int conflict : conflicts) {
      sum += conflict;
    }
    return sum / this.numberOfSims;
  }

  private int nextGuest() {
    int bday = Math.floorMod(r.nextInt(), DaysPerYear);
    // out.println("next guest = " + bday);
    return bday;
  }

  private int haveParty() {
    boolean[] bdays = new boolean[ DaysPerYear ];
    int i, guest_bday, firstConflict;
    for(i = 0; i < DaysPerYear; ++i) {
      guest_bday = nextGuest();
      if (bdays[ guest_bday ] == true) {
        return i;
      } else {
        bdays[ guest_bday ] = true;
      }
    }
    return i;
  }

  public static void main(String[] args) {
    BirthdayProblem bp = new BirthdayProblem(Integer.parseInt(args[0]));
    //bp.nextGuest();
  //  int x = bp.haveParty();
  //  out.println(x);
  }

}
