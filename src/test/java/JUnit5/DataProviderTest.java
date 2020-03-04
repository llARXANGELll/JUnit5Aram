package JUnit5;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@Tag("OneTest")
@DisplayName("Дата драйвер")
public class DataProviderTest {


    @Parameterized.Parameter
    private Object[][]dataprov(){
        return Object[][]{
            {"Vas", 3},
            {"Pet", 1},
        }
    }
    @Test
    @Parameterized.Parameters(name = "dataprov")
    public void paramtest(String name, int age){
        String output = String.format("Name: '%s' | Age '%d'", name, age);
        System.out.println();
    }
}

