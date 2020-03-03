package JUnit5;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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

}
