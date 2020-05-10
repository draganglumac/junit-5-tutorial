package uk.co.gluedit.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// use with 'groups' property, e.g. mvn clean test -Dgroups="Development"
// or with 'excludedGroups' property, e.g. mvn clean test -DexcludedGroups="Production"
@Tag("Development")
public class TestOne {

    @Test
    void testOne() {
        System.out.println("Test 1");
    }

}
