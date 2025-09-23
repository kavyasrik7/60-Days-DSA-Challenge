import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array and k:");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr, k);
        sc.close();

    }

    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int j = 0;
        int[] temp = new int[nums.length];
        for (int i = n - k; i < n; i++) {
            temp[j++] = nums[i];
        }
        for (int i = 0; i < n - k; i++) {
            temp[j++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }

}
