package JUnit5;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;


@Tag("OneTest")
@RunWith(Parameterized.class)
@DisplayName("Дата драйвер")
public class DataProviderTest {

    @Parameterized.Parameters
    public static Object[][] sumTestData() {
        return new Object[][]{
                {"Nasty", 25},
                {"Vera", 50},
        };
    }

    @Test
    @Before
    public void dataProviderTest(String name, int age) {
        System.out.println(name + " " + age);
    }
}
