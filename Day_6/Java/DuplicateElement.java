import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        duplicateElement(arr, n);
        sc.close();

    }

    static void duplicateElement(int[] arr, int n) {
        int size = maxElement(arr, n);
        int[] freq = new int[size + 1];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Print duplicate elements
        System.out.println("Duplicate elements:");
        boolean found = false;
        for (int i = 0; i <= size; i++) {
            if (freq[i] > 1) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No duplicate elements found.");
        }

    }

    static int maxElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
