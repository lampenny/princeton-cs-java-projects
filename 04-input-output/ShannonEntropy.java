public class ShannonEntropy {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int[] frequencies = new int[m];
    double entropy = 0.0;
    double log2 = Math.log(2);
    int[] sequence = StdIn.readAllInts();

    for (int i = 0; i < sequence.length; i++)
      frequencies[sequence[i] - 1]++;

    for (int i = 0; i < frequencies.length; i++) {
      double p = (double) frequencies[i] / (double) sequence.length;
      entropy += p == 0 ? 0 : -p * Math.log(p) / log2;
    }

    StdOut.printf("%.4f\n", entropy);
  }
}
