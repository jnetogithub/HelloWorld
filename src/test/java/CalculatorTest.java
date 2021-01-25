import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sumValues() {
        Calculator calc = new Calculator();
        assertEquals(18,calc.sumValues(2,16));
        assertEquals(17,calc.sumValues(2,15));
    }
}