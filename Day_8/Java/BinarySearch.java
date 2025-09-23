import java.util.Scanner;

public class BinarySearch {
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

    static int search(int arr[], int n, int k) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == k)
                return m;
            else if (arr[m] < k)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }

}
