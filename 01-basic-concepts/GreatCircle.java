// Floating-point numbers and the Math library.
// Source: https://introcs.cs.princeton.edu/java/12types/GreatCircle.java.html

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

       /*************************************************************************
        * Compute using Haversine formula
        *************************************************************************/
        double a = Math.pow(Math.sin((x2-x1)/2), 2)
                 + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2-y1)/2), 2);

        // great circle distance in radians
        double angle = 2 * Math.asin(Math.min(1, Math.sqrt(a)));

        // convert back to degrees
        angle = Math.toDegrees(angle);

        // each degree on a great circle of Earth is 60 nautical miles
        double distance = 60 * angle;

        System.out.println(distance + " kilometers");
    }
}
