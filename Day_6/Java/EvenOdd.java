import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        evenOdd(arr, n);
        sc.close();

    }

    static void evenOdd(int[] arr, int n) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        odd = n - even;
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

}
