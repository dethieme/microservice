package thieme.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService = new CalculatorService();

    @GetMapping("/add")
    public double add(@RequestParam(value = "firstSummand") double firstSummand,
                      @RequestParam(value = "secondSummand") double secondSummand) {
        return calculatorService.add(firstSummand, secondSummand);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam(value = "minuend") double minuend,
                           @RequestParam(value = "subtrahend") double subtrahend) {
        return calculatorService.subtract(minuend, subtrahend);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam(value = "multiplier") double multiplier,
                           @RequestParam(value = "multiplicand") double multiplicand) {
        return calculatorService.multiply(multiplier, multiplicand);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam(value = "dividend") double dividend,
                         @RequestParam(value = "divisor") double divisor) {
        return calculatorService.divide(dividend, divisor);
    }
}
