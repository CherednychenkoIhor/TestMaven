import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void ZeroDenominatorShouldThrowException() {
        MyMath.divide(1, 0);
    }
}
