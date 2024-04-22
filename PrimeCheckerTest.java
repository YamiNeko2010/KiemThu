import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {
    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void testNegativeNumber() {
        String result = primeChecker.checkPrime(-1);
        Assertions.assertEquals("-1 không là số nguyên tố.", result);
    }

    @Test
    public void testZero() {
        String result = primeChecker.checkPrime(0);
        Assertions.assertEquals("0 không là số nguyên tố.", result);
    }

    @Test
    public void testOne() {
        String result = primeChecker.checkPrime(1);
        Assertions.assertEquals("1 không là số nguyên tố.", result);
    }

    @Test
    public void testTwo() {
        String result = primeChecker.checkPrime(2);
        Assertions.assertEquals("2 là số nguyên tố.", result);
    }

    @Test
    public void testCompositeNumber() {
        String result = primeChecker.checkPrime(4);
        Assertions.assertEquals("4 không là số nguyên tố.", result);
    }

    @Test
    public void testPrimeNumber() {
        String result = primeChecker.checkPrime(7);
        Assertions.assertEquals("7 là số nguyên tố.", result);
    }
}
