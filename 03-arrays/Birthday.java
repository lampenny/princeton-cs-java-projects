public class Birthday
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] count = new int[n];
        double[] fraction = new double[n];
        fraction[0] = 0;

        for (int t = 0; t < trials; t++)
        {
            boolean[] room = new boolean[n];
            for (int i = 0; i < n; i++)
            {
                int birthday = (int) (Math.random() * (n - 1));
                if (!room[birthday])
                {
                    room[birthday] = true;
                } else
                {
                    count[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (i > 0)
            {
                fraction[i] = fraction[i - 1] + ((double) count[i] / (double) trials);
            }
            System.out.println((i + 1) + "\t" + count[i] + "\t" + fraction[i]);
            if (fraction[i] >= 0.5) break;
        }
    }
}