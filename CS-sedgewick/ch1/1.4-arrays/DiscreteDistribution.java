import static java.lang.System.out;

public class DiscreteDistribution {
  private int[] values;
  private double[] cdf, pdf; // Cumulative dist. function
//  private double[] pdf;
  private int N, sum, i, loc; // i is for loops

  public DiscreteDistribution(String[] xs) {

    N = xs.length;
    pdf = new double[ N ];
    cdf = new double[ N ]; // 0 is presumed l.b., and 1 u.b.
    values = new int[ N ];

    for(i = 0; i < N; this.sum += values[i++]) {
      values[i] = Integer.parseInt(xs[i]);
    }

    for(i = 0; i < N; ++i) { pdf[i] = (double)values[i]/this.sum; }
    for(cdf[0] = pdf[0], i = 1; i < N; ++i) {
      cdf[i] = pdf[i] + cdf[ i-1 ];
      out.println( cdf[ i-1 ] );
    }
  }

  protected int pickRandom() {

    double rand = Math.random();
    out.println("random val = " + rand);
    for(loc = 0, i = 0; i < N; ++i, ++loc) {
      if (rand < cdf[i]) {
        loc = i;
        break;
      }
    }
    System.out.println("loc, val picked " + loc + ", " + values[loc]);
    return loc;
  }

  public static void main(String[] args) {

    DiscreteDistribution dd = new DiscreteDistribution(args);
    out.println(dd.sum);
    dd.pickRandom();

  }
}
