import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    public Calculator casio;
    @Before
    public void before()
    {casio = new Calculator (4,2);}

    @Test
    public void hasAddition(){
        assertEquals(6, casio.addition());
    }

    @Test
    public void hasSubtraction(){
        assertEquals(2, casio.subtraction());
    }

    @Test
    public void hasDivision(){
        assertEquals(2, casio.division());
    }

    @Test
    public void hasMultiplication(){
        assertEquals(8,casio.multiplication());
    }
}
