package thieme.microservice;

public class CalculatorService {

    public int add(Integer firstSummand, Integer secondSummand) {
        return firstSummand + secondSummand;
    }

    public int subtract(Integer minuend, Integer subtrahend) {
        return minuend - subtrahend;
    }

    public int multiply(Integer multiplier, Integer multiplicand) {
        return multiplier * multiplicand;
    }

    public int divide(Integer numerator, Integer divisor) {
        return numerator / divisor;
    }
}
