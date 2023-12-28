package thieme.microservice;

public class CalculatorService {

    public double add(double firstSummand, double secondSummand) {
        return firstSummand + secondSummand;
    }

    public double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public double multiply(double multiplier, double multiplicand) {
        return multiplier * multiplicand;
    }

    public double divide(double dividend, double divisor) {
        return dividend / divisor;
    }
}
