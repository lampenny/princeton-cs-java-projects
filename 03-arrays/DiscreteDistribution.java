public class DiscreteDistribution
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int cumlativeSum = 0;
        int[] s = new int[args.length + 1];

        for (int i = 1; i < args.length; i++)
        {
            cumlativeSum += Integer.parseInt(args[i]);
        }

        s[0] = 0;

        for (int i = 1; i < args.length; i++)
        {
            s[i] = Integer.parseInt(args[i]) + s[i - 1];
        }

        s[args.length] = s[args.length - 1] + 1;
        for (int i = 0; i < m; i++)
        {
            double random = cumlativeSum * Math.random();
            int randi = (int) random;

            for (int j = 0; j < args.length; j++)
            {
                if (randi >= s[j] && randi < s[j + 1]) {
                    System.out.print(j + 1 + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}