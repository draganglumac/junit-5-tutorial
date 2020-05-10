package uk.co.gluedit.lifecycle;

import org.junit.jupiter.api.*;

public class LifecycleDemoTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println(".Connect to the database");
        System.out.println(".");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("...Load the schema");
    }

    @AfterEach
    void afterEach() {
        System.out.println("...Drop the schema");
        System.out.println(".");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(".Disconnect from the database");
    }

    @Test
    void testOne() {
        System.out.println(".....Test One");
    }

    @Test
    void testTwo() {
        System.out.println(".....Test Two");
    }

}
