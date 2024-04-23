import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextDateTest {

    @Test
    public void testNextDateNormalCase() {
        Assertions.assertEquals("2/1/2010", NextDate.getNextDate(1, 1, 2010));
        System.out.println("Test normal case passed!");
    }

    @Test
    public void testNextDateEndOfMonth() {
        Assertions.assertEquals("1/2/2010", NextDate.getNextDate(31, 1, 2010));
        System.out.println("Test end of month passed!");
    }

    @Test
    public void testNextDateEndOfYear() {
        Assertions.assertEquals("1/1/2011", NextDate.getNextDate(31, 12, 2010));
        System.out.println("Test end of year passed!");
    }

    @Test
    public void testNextDateLeapYear() {
        Assertions.assertEquals("29/2/2012", NextDate.getNextDate(28, 2, 2012));
        System.out.println("Test leap year passed!");
    }

    @Test
    public void testNextDateNonLeapYear() {
        Assertions.assertEquals("1/3/2011", NextDate.getNextDate(28, 2, 2011));
        System.out.println("Test non-leap year passed!");
    }
}
