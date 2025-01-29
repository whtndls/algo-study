package algoStudy;

import java.util.Scanner;

public class BOJ2527 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int p1x = sc.nextInt();
            int p1y = sc.nextInt();

            int p2x = sc.nextInt();
            int p2y = sc.nextInt();

            int p3x = sc.nextInt();
            int p3y = sc.nextInt();

            int p4x = sc.nextInt();
            int p4y = sc.nextInt();

            if (p2x < p3x || p2y < p3y || p4x < p1x || p4y < p1y) {
                System.out.println("d");
            } else if ((p1x == p4x && p1y == p4y) || (p1x == p4x && p2y == p3y) || (p2x == p3x && p2y == p3y) || (p2x == p3x && p1y == p4y)) {
                System.out.println("c");
            } else if (p2x == p3x || p2y == p3y || p4x == p1x || p4y == p1y) {
                System.out.println("b");
            } else {
                System.out.println("a");
            }

        }
    }
}


