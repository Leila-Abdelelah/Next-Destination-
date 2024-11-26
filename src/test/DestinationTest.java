import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DestinationTest {

    @Test
    public void testToString() {
        Destination destination = new Destination("Spain", "Barcelona", "warm", "medium", List.of("beach", "culture"));
        String expected = "Destination: Barcelona, Spain\nWeather: warm\nBudget: medium\nActivities: [beach, culture]";
        assertEquals(expected, destination.toString());
    }

    @Test
    public void testGetters() {
        Destination destination = new Destination("Spain", "Barcelona", "warm", "medium", List.of("beach", "culture"));
        assertEquals("Spain", destination.getCountry());
        assertEquals("Barcelona", destination.getCity());
        assertEquals("warm", destination.getWeather());
        assertEquals("medium", destination.getBudget());
        assertTrue(destination.getActivities().contains("beach"));
    }
}
