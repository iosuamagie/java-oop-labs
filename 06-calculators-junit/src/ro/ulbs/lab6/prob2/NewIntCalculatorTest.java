package ro.ulbs.lab6.prob2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewIntCalculatorTest {

    @Test
    public void testAddPositive() {
        NewIntCalculator calc = new NewIntCalculator(10);
        assertEquals(23577, calc.add(23567).result());
    }

    @Test
    public void testAddNegatives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        assertEquals(-15, calc.add(-25).result());
    }

    @Test
    public void testSubtractPositives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        assertEquals(5, calc.subtract(5).result());
    }

    @Test
    public void testSubtractNegatives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        assertEquals(15, calc.subtract(-5).result());
    }

    @Test
    public void testMultiplyPositives() {
        NewIntCalculator calc = new NewIntCalculator(4);
        assertEquals(20, calc.multiply(5).result());
    }

    @Test
    public void testMultiplyNegatives() {
        NewIntCalculator calc = new NewIntCalculator(4);
        assertEquals(-20, calc.multiply(-5).result());
    }

    @Test
    public void testMultiplyBy0() {
        NewIntCalculator calc = new NewIntCalculator(4);
        assertEquals(0, calc.multiply(0).result());
    }

    @Test
    public void testDividePositives() {
        NewIntCalculator calc = new NewIntCalculator(20);
        assertEquals(5, calc.divide(4).result());
    }

    @Test
    public void testDivideNegatives() {
        NewIntCalculator calc = new NewIntCalculator(20);
        assertEquals(-5, calc.divide(-4).result());
    }

    @Test
    public void testDivideBy0() {
        NewIntCalculator calc = new NewIntCalculator(20);
        assertThrows(ArithmeticException.class, () -> calc.divide(0));
    }
    @Test
    public void testNumereConsecutive() {
        NewIntCalculator calc = new NewIntCalculator(0);
        int i=0;
        while(i<100){
            i++;
            calc.add(i);
        }
        assertEquals(5050, calc.result());
    }

    @Test
    public void testGaussSum() {
        int n = 13;
        int expected = n * (n + 1) / 2; // formula sumei lui Gauss
        NewIntCalculator calc = new NewIntCalculator(0);
        for (int i = 1; i <= n; i++) {
            calc.add(i);
        }
        assertEquals(expected, calc.result());
    }
}
