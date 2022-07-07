import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    static String[] arr;
    @BeforeEach
    void setUp() {
        arr = new String[]{"A2", "notahex", "hex", "8"};
    }

    @Test
    void is_hexadecimal() {
        Boolean[] expected = new Boolean[]{true, false, false, true};
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i], Task4.is_hexadecimal(arr[i]));
        }
    }

    public static int[] push(int n, int[] arr, int x)
    {
        int i;
        int[] newarr = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

    @Test
    void hex_to_decimal() {
        String[] hex = new String[]{"B","C","D","E"};
        int[] decimalActual = new int[0];
        int[] decimalExpected = new int[]{11,12,13,14};
        for (String arg: hex){
            decimalActual = push(decimalActual.length, decimalActual, Task4.hex_to_decimal(arg));
        }
        assertArrayEquals(decimalExpected, decimalActual);
    }
}
