public class Chandrayaan3 {
    private int x;
    private int y;
    private int z;
    private char direction;  // N, S, E, W, U, D


    public String printCoordinatesAndDirection() {
        return "(" + x + ", " + y + ", " + z + ") - " + direction;
    }

    public Chandrayaan3() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.direction = 'N';
    }

    void runsCommands(char[] commands) {
        for (char command : commands) {
            implementCommand(command);
        }
    }

    private void implementCommand(char command) {
        switch (command) {
            case 'f':
                moveForward();
                break;
        }
    }

    public void moveForward() {
        switch (direction) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }
        public static void main (String[]args){
            Chandrayaan3 lunarCraft = new Chandrayaan3();
            System.out.println("Initial Position: " + lunarCraft.printCoordinatesAndDirection());

            // Print the final position and direction
            System.out.println("Final Position: " + lunarCraft.printCoordinatesAndDirection());

        }
    }

