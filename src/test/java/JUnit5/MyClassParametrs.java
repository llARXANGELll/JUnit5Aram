package JUnit5;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@Tag("OneTest")
@RunWith(Parameterized.class)
public class MyClassParametrs {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test_int_arrays(int arg) {
        assertTrue(arg > 0);
    }

    private void assertTrue(boolean b) {
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(ints = {1, 2, 3})
    void test_int_arrays_custom_name(int arg) {
        assertTrue(arg > 0);
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"apple", "banana", "orange"})
    void test_string_arrays_custom_name(String arg) {
        assertTrue(arg.length() > 1);
    }

}
