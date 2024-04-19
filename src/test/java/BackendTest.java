import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BackendTest {

    @Test
    public void testSquareNumber_positiveInput() {
        Backend backend = new Backend();
        assertEquals(25, backend.squareNumber(5));
    }

    @Test
    public void testSquareNumber_negativeInput() {
        Backend backend = new Backend();
        assertEquals(16, backend.squareNumber(-4));
    }

    @Test
    public void testSquareNumber_zeroInput() {
        Backend backend = new Backend();
        assertEquals(0, backend.squareNumber(0));
    }
}
