import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    Calculator calculator = new Calculator();
    private static final double DELTA = 1e-15;

    @Test
    public void testSqrt(){
        double num = 64.0;
        double expected = 8.0;
        double res = Math.sqrt(num);
        Assert.assertEquals(expected,res,DELTA);
    }

    @Test
    public void testFact(){
        int num = 5;
        int expected = 120;
        int res = calculator.factorial(num);
        Assert.assertEquals(expected,res,DELTA);
    }

    @Test
    public void testNLog(){
        double num = 10.0;
        double expected = 2.302585092994046;
        double res = Math.log(num);
        Assert.assertEquals(expected,res,DELTA);
    }

    @Test
    public void testPower(){
        double base = 2.0;
        double exp = 3.0;
        double expected = 8.0;
        double res = Math.pow(base,exp);
        Assert.assertEquals(expected,res,DELTA);
    }
}
