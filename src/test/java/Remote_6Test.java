import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Remote_6Test {

    @Test
    public void example() {
        assertEquals(49, Remote_6.tvRemote("Code Wars"));
    }

    @Test
    public void lower() {
        assertEquals(16, Remote_6.tvRemote("does"));
        assertEquals(21, Remote_6.tvRemote("your"));
        assertEquals(33, Remote_6.tvRemote("solution"));
        assertEquals(18, Remote_6.tvRemote("work"));
        assertEquals(12, Remote_6.tvRemote("for"));
        assertEquals(27, Remote_6.tvRemote("these"));
        assertEquals(23, Remote_6.tvRemote("words"));
    }

    @Test
    public void upper() {
        assertEquals(19, Remote_6.tvRemote("DOES"));
        assertEquals(22, Remote_6.tvRemote("YOUR"));
        assertEquals(34, Remote_6.tvRemote("SOLUTION"));
        assertEquals(19, Remote_6.tvRemote("WORK"));
        assertEquals(15, Remote_6.tvRemote("FOR"));
        assertEquals(28, Remote_6.tvRemote("THESE"));
        assertEquals(24, Remote_6.tvRemote("WORDS"));
    }

    @Test
    public void mixed() {
        assertEquals(28, Remote_6.tvRemote("Does"));
        assertEquals(33, Remote_6.tvRemote("Your"));
        assertEquals(45, Remote_6.tvRemote("Solution"));
        assertEquals(26, Remote_6.tvRemote("Work"));
        assertEquals(20, Remote_6.tvRemote("For"));
        assertEquals(35, Remote_6.tvRemote("These"));
        assertEquals(31, Remote_6.tvRemote("Words"));
    }

}