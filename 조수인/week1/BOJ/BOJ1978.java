package algoStudy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        boolean[] prime = new boolean[arr[n - 1] + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i < prime.length; i++) {
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = false;
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (prime[arr[i]]) cnt++;
        }
        System.out.println(cnt);

    }
}
