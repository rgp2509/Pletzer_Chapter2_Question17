import org.junit.Test;

import static org.junit.Assert.*;

public class Pletzer_2_17Test {
    @Test
    public void calculatorTest() throws Exception {
        double temp = 30, wind = 10;
        assertEquals(21.2482, Pletzer_2_17.Calculator(temp,wind),.1);
    }

}