public class Chandrayaan3 {
    private int x;
    private int y;
    private int z;
    private char direction;  // N, S, E, W, U, D
    private char alternate_direction;


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
        if(direction=='U'||direction=='D'){
            switch (alternate_direction){
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
        else{
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
    }

    public void turnRight() {
        if(direction=='U'||direction=='D'){
            switch (alternate_direction){
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
        else {
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
    }
    public void MoveUp() {
        if(direction!='U'){
            alternate_direction=direction;
        }
        if (direction == 'N' || direction == 'S'||direction == 'E'||direction == 'W' || direction =='D') {
            direction = 'U';
        }
    }

    public void MoveDown() {
        if(direction!='U'){
            alternate_direction=direction;
        }
        if (direction == 'N' || direction == 'S' || direction == 'E' || direction == 'W' || direction =='D') {
            direction = 'D';
        }
    }

    public static void main (String[]args){
        Chandrayaan3 lunarCraft = new Chandrayaan3();
        System.out.println("Initial Position: " + lunarCraft.printCoordinatesAndDirection());

        // Print the final Co-ordinates and direction
        System.out.println("Final Position: " + lunarCraft.printCoordinatesAndDirection());

        }
    }

