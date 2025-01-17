import java.util.Scanner;

public class ArrayProblems
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Problem 1
        double[] values = new double[3];
        System.out.println("Enter three double values:");
        values[0] = scanner.nextDouble();
        values[1] = scanner.nextDouble();
        values[2] = scanner.nextDouble();

        double sum = values[0] + values[1] + values[2];

        System.out.println("Array contents: " + values[0] + ", " + values[1] + ", " + values[2]);
        System.out.println("Sum of array: " + sum);

        // Problem 2
        System.out.print("Enter a positive number N: ");
        int N = scanner.nextInt();
        
        if (N < 0)
        {
            System.out.println("Please enter a positive number.");
        }
        else
        {
            int[] sums = new int[N];
            sums[0] = 0;

            for (int i = 1; i < N; i++)
            {
                sums[i] = sums[i - 1] + i;
            }

            System.out.print("Summed array: {");
            for (int i = 0; i < N; i++)
            {
                System.out.print(sums[i]);
                if (i < N - 1) System.out.print(", ");
            }
            System.out.println("}");
        }

        scanner.close();
    }
}
