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
            case 'b':
                moveBackward();
                break;
            case 'l':
                turnLeft();
                break;
            case 'r':
                turnRight();
                break;
            case 'u':
                MoveUp();
                break;
            case 'd':
                MoveDown();
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

    public void moveBackward() {
        switch (direction) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }
    public void MoveUp() {
        direction = 'u';
    }

    public void MoveDown() {
        direction = 'd';
    }

    public static void main (String[]args){
        Chandrayaan3 lunarCraft = new Chandrayaan3();
        System.out.println("Initial Position: " + lunarCraft.printCoordinatesAndDirection());

        // Print the final Co-ordinates and direction
        System.out.println("Final Position: " + lunarCraft.printCoordinatesAndDirection());

        }
    }

