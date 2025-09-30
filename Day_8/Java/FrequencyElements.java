import java.util.Scanner;

public class FrequencyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        frequency(arr, n);
        sc.close();
    }

    static void frequency(int arr[], int n) {
        int freq[] = new int[n];
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            freq[i] = count;
        }
        System.out.println("Element\tFrequency");
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                System.out.println(arr[i] + "\t" + freq[i]);
            }
        }
    }

}
