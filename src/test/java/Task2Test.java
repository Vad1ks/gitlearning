import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    String st;
    @BeforeEach
    void setUp() {
        st = "This is test string";
    }

    @Test
    void getEncryptedStr() {
        String expected = "hTsii  settss rtni";
        String actual = Task2.getEncryptedStr(st);
        assertEquals(expected,actual);
    }

    @Test
    void getEncryptedStr1() {

    }

    @Test
    void getEncryptedStr2() {

    }
}
