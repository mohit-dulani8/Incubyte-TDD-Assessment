import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testInitialCoordinates() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        Assertions.assertEquals("(0, 0, 0) - N", lunarCraft.printCoordinatesAndDirection());
    }
}