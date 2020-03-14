package JUnit5;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.annotations.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DataProviderTest {

    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 6, 8},
                {18, 2, 20},
                {13, 15, 28},
                {1, 5, 6}
        });
    }

    @Test
    @ParameterizedTest
    @MethodSource("dataForTest")
    public void paramTest(int a, int b, int c ) {
        int calc = a + b;
        assertEquals(calc,c);
        System.out.println(a + " + " + b + " = " + c);
    }
}