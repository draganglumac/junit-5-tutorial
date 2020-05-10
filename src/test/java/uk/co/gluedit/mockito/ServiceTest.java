package uk.co.gluedit.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @Mock
    Repository repository;

    @InjectMocks
    Service service;

    @Test
    void testSuccess() {
        // Setup mock scenario
        try {
            Mockito
                    .when(repository.getStuff())
                    .thenReturn(Arrays.asList("A", "B", "CDEFGHIJK", "12345", "1234"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Execute the service that uses the mocked repository
        List<String> stuff = service.getStuffWithLengthLessThanFive();

        // Validate response
        Assertions.assertNotNull(stuff);
        Assertions.assertEquals(3, stuff.size());
    }

    @Test
    void testException() {
        // Setup mock scenario
        try {
            Mockito
                    .when(repository.getStuff())
                    .thenThrow(new SQLException("Connection exception"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Execute the service that uses the mocked repository
        List<String> stuff = service.getStuffWithLengthLessThanFive();

        // Validate response
        Assertions.assertNotNull(stuff);
        Assertions.assertEquals(0, stuff.size());
    }

}
