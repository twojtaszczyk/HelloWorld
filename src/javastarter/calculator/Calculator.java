package javastarter.calculator;

public class Calculator {

    public static void main(String[] args) {
        double sumResult = sum(42.4, 32.3);
        System.out.println(sumResult);
        double subtractResult = subtract(42.4, 32.3);
        System.out.println(subtractResult);
        double multiplyResult = multiply(42.4, 32.3);
        System.out.println(multiplyResult);
        double divideResult = divide(42.4, 0);
        System.out.println(divideResult);
    }

    public static double sum(double x, double y) {
        return x + y;
    }
    public static double subtract(double x, double y) {
        return x - y;
    }
    public static double multiply(double x, double y) {
        return x * y;
    }
    public static double divide(double x, double y) {
        return x / y;
    }
}
