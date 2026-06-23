import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(2, 3), 5);
    }

    @Test
    public void testSub() {
        Calculator calc = new Calculator();
        assertEquals(calc.sub(5, 2), 3);
    }

    @Test
    public void testMul() {
        Calculator calc = new Calculator();
        assertEquals(calc.mul(2, 3), 6);
        System.out.println("Hello world");
    }
}