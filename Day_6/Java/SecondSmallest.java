import java.util.Scanner;

class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = secondSmallest(arr, n);
        if (result == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println(result);
        }
        sc.close();

    }

    public static int secondSmallest(int[] arr, int n) {
        int s = arr[0];
        int sm = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] < s) {
                sm = s;
                s = arr[i];

            } else if (arr[i] < sm && s != arr[i]) {
                sm = arr[i];
            }
        }
        return sm;

    }
}