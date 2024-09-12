/******************************************************************************
 *  Compilation:  javac UniformRandomNums.java
 *  Execution:    java UniformRandomNums
 * 
 *  TASK: Uniform random numbers. 
 *  Write a program that prints five uniform random numbers between 0 and 1, their 
 *  average value, and their minimum and maximum values. Use Math.random(), 
 *  Math.min(), and Math.max().
 *
 *  % java UniformRandomNums
 *  Uniform random numbers: 
 *  0.5811982801181715
 *  0.00642064222667138
 *  0.8889026532699061
 *  0.6093028494201004
 *  0.8536348186104198
 *  Average = 0.5878918487290539
 *  Min     = 0.00642064222667138
 *  Max     = 0.8889026532699061
 *
 *
 ******************************************************************************/

public class UniformRandomNums {
    public static void main(String[] args) {
        int n = 5;
    
        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();

        System.out.println("Uniform random numbers: ");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        
        double min     = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
        double max     = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
        double average = (x1 + x2 + x3 + x4 + x5) / n;

        System.out.println("Average = " + average);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
    }
}
