public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;

        System.out.println("(" + x + ", " + y + ")"); // (0, 0)

        while (Math.abs(x) + Math.abs(y) < r) {
            double n = Math.random();
            if (n < 0.25)
                y--;
            else if (n < 0.50)
                x--;
            else if (n < 0.75)
                y++;
            else if (n < 1.00)
                x++;
                
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }

        System.out.println("Steps = " + steps);
    }
}
