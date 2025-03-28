import java.util.Scanner;

public class Main2 {
    // Recursive function to compute sum of array elements
    public static int sum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sum(arr, n - 1);
    }

    // Complexity: linear - O(N)
    public static double findAverage(int[] arr, int n) {
        return (double) sum(arr, n) / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findAverage(arr, n));
        scanner.close();
    }
}
