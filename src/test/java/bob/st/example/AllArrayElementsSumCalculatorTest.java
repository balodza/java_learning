package bob.st.example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * This is example how classes should return values.
 */
public class AllArrayElementsSumCalculatorTest {
    private AllArrayElementsSumCalculator calculator = new AllArrayElementsSumCalculator() ;

    @Test
    public void calculateEmptyArraySum() {
        final int result = calculator.calculate(new int[]{});
        assertEquals(0, result);
    }

    @Test
    public void calculateNonEmptyArrayWithAllZeroesSum() {
        final int result = calculator.calculate(new int[]{0, 0, 0, 0, 0, 0});
        assertEquals(0, result);
    }

    @Test
    public void calculateSum() {
        final int result = calculator.calculate(new int[]{1, 2, 3, 4, 5});
        assertEquals(15, result);
    }
}