import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testfindMagicSquares1() {
        String squares = Main.findMagicSquares(4);
        assertEquals("1 36 1225 41616 ", squares, "The first four magic squares should be 1, 36, 1225, 4161");
    }
    @Test
    public void testfindMagicSquares2() {
        String squares = Main.findMagicSquares(10);
        assertEquals("1 36 1225 41616 1413721 48024900 65536 59938564 137053849 392554969 ", squares, "The first four magic squares should be 1, 36, 1225, 4161");
    }

    public void testfindLeastCommonMultiple1() {
        // Test Case 1: LCM of 12 and 18
        assertEquals(36, Main.findLeastCommonMultiple(12, 18), "LCM of 12 and 18 should be 36");
    }

    public void testfindLeastCommonMultiple2() {
        // Test Case 3: LCM of 21 and 6
        assertEquals(42, Main.findLeastCommonMultiple(21, 6), "LCM of 21 and 6 should be 42");
    }
}
