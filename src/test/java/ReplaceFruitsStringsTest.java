import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceFruitsStringsTest {

    @Test
    public void testEmptyFruit() {
        assertTrue(ReplaceFruitsStrings.removeRotten(new String[0]).length == 0);
    }

    @Test
    public void testAllRottenArray() {
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
        String [] expected = new String []{"apple","banana","apple","pineapple","kiwi"};
        assertArrayEquals(expected, ReplaceFruitsStrings.removeRotten(rotten));
    }
}