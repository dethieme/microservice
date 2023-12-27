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
    public int add(@RequestParam(value = "firstSummand", defaultValue = "0") Integer firstSummand,
                   @RequestParam(value = "secondSummand", defaultValue = "0") Integer secondSummand) {
        return calculatorService.add(firstSummand, secondSummand);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam(value = "minuend", defaultValue = "0") Integer minuend,
                        @RequestParam(value = "subtrahend", defaultValue = "0") Integer subtrahend) {
        return calculatorService.subtract(minuend, subtrahend);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam(value = "multiplier", defaultValue = "0") Integer multiplier,
                        @RequestParam(value = "multiplicand", defaultValue = "0") Integer multiplicand) {
        return calculatorService.multiply(multiplier, multiplicand);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam(value = "numerator", defaultValue = "0") Integer numerator,
                      @RequestParam(value = "divisor", defaultValue = "1") Integer divisor) {
        return calculatorService.divide(numerator, divisor);
    }
}
