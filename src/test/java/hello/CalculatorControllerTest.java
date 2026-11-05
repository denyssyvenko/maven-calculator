package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorControllerTest {

    private final CalculatorController controller = new CalculatorController();

    // Проходить: ціле число повертається без дробової частини
    @Test
    void integerResultHasNoDecimalPart() {
        assertEquals("2", controller.calculate("1+1"));
    }
    // Завжди падає: 5-1 = 4, а очікуємо 2
    //@Test
    //void alwaysFailingTest() {
    //    assertEquals("2", controller.calculate("5-1"));
    //}
}