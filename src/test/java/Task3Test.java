import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    static String[] arr;
    @BeforeEach
    public void setUp() {
        arr = new String[]{"17.2", "22", "15 sheep", "+19.3"};
    }

    @Test
    void is_decimal() {
        Boolean[] expected = new Boolean[]{true, false, false, true};
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i], Task3.is_decimal(arr[i]));
        }
    }
}
