package algoStudy;

import java.util.Scanner;

public class BOJ1244 {

    static int[] buttonSwitch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        buttonSwitch = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            buttonSwitch[i] = sc.nextInt();
        }

        int students = sc.nextInt();
        for (int i = 0; i < students; i++) {
            int sex = sc.nextInt();
            int receivedNum = sc.nextInt();

            if (sex == 1) {
                for (int j = receivedNum; j < n + 1; j += receivedNum) {
                    buttonSwitch[j] = buttonSwitch[j] == 1 ? 0 : 1;
                }
            } else {
                sexFemale(receivedNum, n);
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(buttonSwitch[i] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }

    }

    private static void sexFemale(int receivedNum, int n) {
        int lt = receivedNum;
        int rt = receivedNum;

        while (lt > 0 && rt <= n && buttonSwitch[lt] == buttonSwitch[rt]) {
            lt--;
            rt++;
        }

        for (int i = lt + 1; i < rt; i++) {
            buttonSwitch[i] = buttonSwitch[i] == 1 ? 0 : 1;
        }
    }

}
