import java.util.Scanner;

public class Main1 {
    // Complexity: linear - O(N)
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int minRest = findMin(arr, n - 1);
        return (arr[n - 1] < minRest) ? arr[n - 1] : minRest;
    }

    // Complexity: linear - O(N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findMin(arr, n));

        scanner.close();
    }
}