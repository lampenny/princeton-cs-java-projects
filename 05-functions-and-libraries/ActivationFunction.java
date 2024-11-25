public class ActivationFunction {
  // An activation function is a function that maps real numbers
  // into a desired range, such as between 0 and 1 or between –1 and +1.

  // Returns the Heaviside function of x.
  public static double heaviside(double x) {
    if (Double.isNaN(x)) { return Double.NaN };

    if (x < 0) {
      return 0;
		} else if (x == 0) {
      return 0.5;
    } else {
      return 1;
    }
	}

  // Returns the sigmoid function of x.
  public static double sigmoid(double x) {
    if (Double.isNaN(x)) { return Double.NaN };

    return 1 / (1 + Math.exp(-x));
  }

  // Returns the hyperbolic tangent of x.
  public static double tanh(double x) {
    if (Double.isNaN(x)) { return Double.NaN };

    if (x >= 20) { return 1.0; }
    if (x <= -20) { return -1.0; }

    return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x))
  }

  // Returns the softsign function of x.
  public static double softsign(double x) {
    if (Double.isNaN(x)) { return Double.NaN };

    if (x == Double.POSITIVE_INFINITY) { return 1; }
    if (x == Double.NEGATIVE_INFINITY) { return -1; }

    return x / (1 + Math.abs(x))
  }

  // Returns the square nonlinearity function of x.
  public static double sqnl(double x) {

  }

  // Takes a double command-line argument x and prints each activation
  // function, evaluated, in the format (and order) given below.
  public static void main(String[] args) {

  }
}
