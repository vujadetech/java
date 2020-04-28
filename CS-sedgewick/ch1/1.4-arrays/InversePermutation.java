// Exercise 1.4.28

import static java.lang.System.out;

public class InversePermutation {
  private  int[] sigmas, xs;

  private int N, i; // i is for loops

  public InversePermutation(String[] args) {

    N = args.length;
    xs = new int[ N ];
    sigmas = new int[ N ];

    for(i = 0; i < N; ++i) {
      sigmas[i] = Integer.parseInt(args[i]);
      xs[sigmas[i]] = i;
    }
  }

  public void printArray(int[] xs) {
    for(int x: xs) { out.println(x); }
  }

  public static void main(String[] args) {

    InversePermutation phi = new InversePermutation(args);
    phi.printArray(phi.xs);
    phi.printArray(phi.sigmas);
    for(int i = 0; i < phi.N; ++i) {
      out.print(phi.xs[phi.sigmas[i]]);
    }

  }
}
