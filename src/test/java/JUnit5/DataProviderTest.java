package JUnit5;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;


@Tag("OneTest")
@RunWith(DataProviderRunner.class)
@DisplayName("Дата драйвер")
public class DataProviderTest {


    @DataProvider
    public static Object[][] sumTestData() {
        return new Object[][]{
                {"Nasty", 25},
                {"Vera", 50},
        };
    }

    @Test
    @UseDataProvider("sumTestData")
    public void dataProviderTest(String name, int age) {
        System.out.println(name + " " + age);
    }
}
