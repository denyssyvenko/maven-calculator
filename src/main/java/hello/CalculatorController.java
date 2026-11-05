package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public String calculate(@RequestParam("expression") String expression) {
        try {
            double result = Calculator.evaluate(expression);
            if (result == Math.rint(result) && !Double.isInfinite(result)) {
                return String.valueOf((long) result);
            }
            return String.valueOf(result);
        } catch (Exception e) {
            return "Помилка: некоректний вираз";
        }
    }
}