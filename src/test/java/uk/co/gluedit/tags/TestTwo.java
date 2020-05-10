package uk.co.gluedit.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// use with 'groups' property, e.g. mvn clean test -Dgroups="Development"
@Tag("Development")
public class TestTwo {

    @Test
    void testTwo() {
        System.out.println("Test 2");
    }

}
