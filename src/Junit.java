import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Junit {
    @Test
    public void SumTest() {
        var calculator = new CalculatorServiceImpl();

        var sumResult = calculator.sum(5, 5);

        assertEquals(sumResult, 5 + 5);

    }

    @Test
    public void ProdTest() {
        var calculator = new CalculatorServiceImpl();

        var prodResult = calculator.prod(2, 2);

        assertEquals(prodResult, 2 * 2);
    }
}