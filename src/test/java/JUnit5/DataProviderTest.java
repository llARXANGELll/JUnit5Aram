package JUnit5;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


@Tag("OneTest")
@DisplayName("Параметрезированный тест")
public class DataProviderTest {

    public static final Logger LOG = LoggerFactory.getLogger(DataProvider.class);

    @DataProvider
    public static Object[][] dataProvider(){
        return new Object[][] {
                {"Nasty", 55},
                {"Masha", 19},
        };
    }
    @Test
    @UseDataProvider("dataProvider")
    public void tesnIn(String name, int age) {
        String print = String.format("Имя: %s | Вззраст: %d", name, age);
        System.out.println(print);
    }