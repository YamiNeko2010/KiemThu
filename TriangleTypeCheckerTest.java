import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTypeCheckerTest {

    private final TriangleTypeChecker triangleTypeChecker = new TriangleTypeChecker();

    @Test
    public void testEquilateral() {
        String result = triangleTypeChecker.checkTriangleType(2, 2, 2);
        Assertions.assertEquals("Equilateral", result);
    }

    @Test
    public void testIsosceles() {
        String result = triangleTypeChecker.checkTriangleType(2, 2, 3);
        Assertions.assertEquals("Isosceles", result);
    }

    @Test
    public void testScalene() {
        String result = triangleTypeChecker.checkTriangleType(2, 3, 4);
        Assertions.assertEquals("Scalene", result);
    }

    @Test
    public void testRightTriangle() {
        String result = triangleTypeChecker.checkTriangleType(3, 4, 5);
        Assertions.assertEquals("RightTriangle", result);
    }

    @Test
    public void testNotATriangle() {
        String result = triangleTypeChecker.checkTriangleType(0, 1, 2);
        Assertions.assertEquals("NotATriangle", result);
    }
}
