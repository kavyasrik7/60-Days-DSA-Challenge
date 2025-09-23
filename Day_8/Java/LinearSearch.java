import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array and number to be search:");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = search(arr, n, k);
        System.out.println("Index:" + res);
        sc.close();
    }

    public static int search(int arr[], int n, int k) {
        if (n == 0)
            return -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                return i;
        }
        return -1;
    }

}
