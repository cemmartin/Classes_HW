import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
        //can add pre-set numbers in here to use below
    }

    @Test
    public void addFunction(){
        int number1 = 2;
        int number2 = 3;
        assertEquals(5, calculator.addFunction(number1, number2));
    }

    @Test
    public void subtractFunction(){
        int number1 = 12;
        int number2 = 3;
        assertEquals(4, calculator.subtractFunction(number1, number2));
    }

    @Test
    public void multiplyFunction(){
        int number1 = 8;
        int number2 = 4;
        assertEquals(2, calculator.multiplyFunction(number1, number2));
    }

    @Test
    public void divideFunction(){
        double number3 = 6;
        double number4 = 4;
        assertEquals(1.5,calculator.divideFunction(number3, number4), 0);

    }

}