import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testInitialCoordinates() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        Assertions.assertEquals("(0, 0, 0) - N", lunarCraft.printCoordinatesAndDirection());
    }

    @Test
    public void testForwardCoordinates() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'f'});
        Assertions.assertEquals("(0, 1, 0) - N", lunarCraft.printCoordinatesAndDirection());
    }

    @Test
    public void testBackwardCoordinates() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'b'});
        Assertions.assertEquals("(0, -1, 0) - N", lunarCraft.printCoordinatesAndDirection());
    }

    @Test
    public void testLeftTurnCoordinates() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'l'});
        Assertions.assertEquals("(0, 0, 0) - W", lunarCraft.printCoordinatesAndDirection());
    }




}