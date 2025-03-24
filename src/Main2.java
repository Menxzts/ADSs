import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(average(arr, n));
    }
    public static float average(float[] arr, int n) {
            float result = 0;
        for (int i = 0; i < n; i++) {
            result = result + arr[i];
        }
        result = result / n;
        return result;
    }
}
