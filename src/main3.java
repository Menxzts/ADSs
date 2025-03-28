import java.util.Scanner;

public class main3 {
    // Recursive function to check if n is divisible by any number from 2 to sqrt(n)
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }

    // Complexity: O(sqrt(N))
    public static String checkPrime(int n) {
        return (isPrime(n, 2)) ? "Prime" : "Composite";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(checkPrime(n));
        scanner.close();
    }
}

