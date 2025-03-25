import java.util.Scanner;

public class main3 {

    public static boolean isPrimeRecursive(int n, int divisor) {
        if (n < 2) return false;
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;
        return isPrimeRecursive(n, divisor - 1);
    }

    public static boolean isPrime(int n) {
        return isPrimeRecursive(n, n / 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n + " is " + (isPrime(n) ? "Prime" : "Composite"));

        scanner.close();
    }
}

