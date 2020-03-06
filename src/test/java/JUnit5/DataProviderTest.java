package JUnit5;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


@Tag("OneTest")
@DisplayName("Дата драйвер")
@RunWith(Parameterized.class)
public class DataProviderTest {
    private int valueA;
    private int valueB;
    private int expected;

    public DataProviderTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
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
    public void paramTest() {
        assertEquals(expected, new Calculator().getSum(valueA,valueB));
    }
}

