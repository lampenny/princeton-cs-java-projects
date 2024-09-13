public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int steps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;


            while (Math.abs(x) + Math.abs(y) != r) {
                steps++;

                double n = Math.random();
                if (n < 0.25)
                    x--;
                else if (n < 0.50)
                    x++;
                else if (n < 0.75)
                    y--;
                else if (n < 1.00)
                    y++;
            }
        }

        double average = (double) steps /  (double) trials;

        System.out.println("Average number of steps = " + average);
    }
}
