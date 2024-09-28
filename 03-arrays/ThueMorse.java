public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Create a boolean array of length n.
        int[] sequence = new int[n];

        // Initialize the first bit in the array to false.
        sequence[0] = 0;

        // Generates the thue morse sequence
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) // checks if i is power of 2
                sequence[i] = sequence[i / 2];
            else
                sequence[i] = 1 - sequence[i - 1];
        }

        // Prints the sequence matrix using a double nested loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sequence[i] == sequence[j])
                    System.out.print("+  ");
                else
                    System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
