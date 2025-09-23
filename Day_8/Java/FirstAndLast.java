import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = search(arr, t);
        System.out.println(res[0] + " " + res[1]);
        sc.close();

    }

    static int[] search(int[] nums, int t) {
        int[] result = { -1, -1 };
        result[0] = first(nums, t);
        result[1] = last(nums, t);
        return result;
    }

    static int first(int[] nums, int t) {
        int first = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == t) {
                first = i;
                break;
            }
        }
        return first;

    }

    static int last(int[] nums, int t) {
        int last = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == t) {
                last = i;
                break;
            }

        }
        return last;
    }

}
