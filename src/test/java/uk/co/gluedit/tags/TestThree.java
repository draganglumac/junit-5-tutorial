package uk.co.gluedit.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// use with 'groups' property, e.g. mvn clean test -Dgroups="Development, Production"
@Tag("Production")
public class TestThree {

    @Test
    void testThree() {
        System.out.println("Test 3");
    }

}
