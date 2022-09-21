
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class JUnit {

    @Test
    public void testCountLines() {

        Words c = new Words();
        int actual = c.getnumberOfRows();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testSaveWords() {

        Words c = new Words();
        c.saveWords();
        int actual = c.getnumberOfRows();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testSaveCharacters() {

        Words c = new Words();
        c.saveCharacters();
        int actual = c.getNumberOfCharacters();
        int expected = 1;

        assertEquals(expected, actual);
    }
}
