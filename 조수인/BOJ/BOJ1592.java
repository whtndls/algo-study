package algoStudy;

import java.util.Scanner;

public class BOJ1592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int[] arr = new int[n];
        arr[0] = 1;

        int index = 0;
        int answer = 0;
        while (true) {
            if (arr[index] >= m)
                break;

            if (arr[index] % 2 == 1) {
                index += l;
            } else {
                index -= l;
            }

            if (index < 0) {
                index = n - Math.abs(index);
            } else if (index >= n) {
                index = index - n;
            }

            arr[index]++;
            answer++;


        }
        System.out.println(answer);

    }





}
