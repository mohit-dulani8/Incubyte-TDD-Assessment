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

    @Test
    public void testRightTurnCoordinates() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'r'});
        Assertions.assertEquals("(0, 0, 0) - E", lunarCraft.printCoordinatesAndDirection());
    }

    @Test
    public void testMoveUpCoordinates() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'u'});
        Assertions.assertEquals("(0, 0, 0) - U", lunarCraft.printCoordinatesAndDirection());
    }

    @Test
    public void testMoveDownCoordinates() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'d'});
        Assertions.assertEquals("(0, 0, 0) - D", lunarCraft.printCoordinatesAndDirection());
    }

    @Test
    public void testGivenInput() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'f','r','u','b','l'});
        Assertions.assertEquals("(0, 1, -1) - N", lunarCraft.printCoordinatesAndDirection());
    }

    @Test
    public void generalTest1() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'f','r','r','b','f','f'});
        Assertions.assertEquals("(0, 0, 0) - S", lunarCraft.printCoordinatesAndDirection());
    }

    @Test
    public void generalTest2() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'b','l','b','b','r','f'});
        Assertions.assertEquals("(2, 0, 0) - N", lunarCraft.printCoordinatesAndDirection());
    }

    @Test
    public void generalTest3() {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        lunarCraft.runsCommands(new char[]{'l','l','l'});
        Assertions.assertEquals("(0, 0, 0) - E", lunarCraft.printCoordinatesAndDirection());
    }


}