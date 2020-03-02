package JUnit5;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmplTest {
    private static final Logger LOG = LoggerFactory.getLogger(SmplTest.class);

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

    @Test
    void test(){
        LOG.info("test");
    }

    @Test
    void test2(){
        LOG.info("test2");
    }
}

