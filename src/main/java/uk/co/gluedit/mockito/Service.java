package uk.co.gluedit.mockito;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    private Repository repository;

    public List<String> getStuffWithLengthLessThanFive() {
        try {
            return repository
                    .getStuff()
                    .stream()
                    .filter(stuff -> stuff.length() < 5)
                    .collect(Collectors.toList());
        } catch (SQLException e) {
            return Collections.emptyList();
        }
    }

}
