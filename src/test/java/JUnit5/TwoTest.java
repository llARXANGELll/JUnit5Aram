package JUnit5;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@DisplayName("Первый простой тест")
public class TwoTest {
    private static final Logger LOG = LoggerFactory.getLogger(TwoTest.class);

    @BeforeAll
    static void beforeall(){
        LOG.info("beforeall");
    }

    @BeforeEach
    void befor(){
        LOG.info("befor");
    }

    static  @AfterAll
    void afteral(){
        LOG.info("afteral");
    }

    @AfterEach
    void afterea(){
        LOG.info("afterea");
    }


    @DisplayName("Первый простой тест")
    @Test
    void test(){
        LOG.info("test");
    }

    @Tag("Test2Excl")
    @DisplayName("Второй простой тест")
    @Test
    void test2(){
        LOG.info("test2");
    }


}

