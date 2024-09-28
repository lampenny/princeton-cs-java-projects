public class Minesweeper
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[][] grid = new int[m][n];
        int[] mines = new int[k * 2];

        double mathRandom = Math.random();

        // Generate the coordinates of minus in the array
        int coordinate = 0;
        while (k * 2 > coordinate) {
            int a = (int) (mathRandom * m), b = (int) (mathRandom * n);
            if (grid[a][b] == 0) {
                grid[a][b] = -1;

                mines[coordinate] = a;
                mines[coordinate + 1] = b;
                coordinate += 2;
            }
        }

        // Increase the number of neighboring mines
        for (int i = 0; i < k * 2; i += 2) {
            for (int a = -1; a < 2; a++) {
                if (mines[i] + a >= 0 && mines[i] + a < m) {
                    for (int b = -1; b < 2; b++) {
                        if (mines[i + 1] + b >= 0 && mines[i + 1] + b < n && grid[mines[i] + a][mines[i + 1] + b] >= 0) {
                            grid[mines[i] + a][mines[i + 1] + b]++;
                        }
                    }
                }
            }
        }

        // Print the grid
        for (
                int i = 0;
                i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] >= 0) System.out.print(grid[i][j] + "  ");
                else System.out.print("*  ");
            }
            System.out.println();
        }
    }
}