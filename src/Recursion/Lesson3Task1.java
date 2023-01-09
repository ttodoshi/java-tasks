package Recursion;

public class Lesson3Task1 {
    public static void main(String[] args) {
        bisection(0, 10);
    }

    public static double function(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public static void bisection(double a, double b) {
        double c = (a + b) / 2;
        if (b-a <= 0.001){
            System.out.printf("%.3f" + " +- 0.001", c);
            return;
        }
        if (function(a) * function(c) < 0) {
            bisection(a, c);
        } else {
           bisection(c, b);
        }
    }
}
