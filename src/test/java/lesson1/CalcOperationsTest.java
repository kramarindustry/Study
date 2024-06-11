import org.example.lesson1.CalcOperations;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class CalcOperationsTest {
    @Test
    public void twoPlusTwoShouldEqualsFour() {
        var calculator = new CalcOperations();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void threePlusSevenShouldEqualsTen() {
        var calculator = new CalcOperations();
        assertEquals(10, calculator.add(3, 7));
    }
}