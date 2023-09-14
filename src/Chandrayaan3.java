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

    public static void main(String[] args) {
        Chandrayaan3  lunarCraft= new Chandrayaan3();
        System.out.println("Initial Position: " + lunarCraft.printCoordinatesAndDirection());

        // Print the final position and direction
        System.out.println("Final Position: " + lunarCraft.printCoordinatesAndDirection());

    }
}