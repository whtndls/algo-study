import java.util.Scanner;

public class BOJ2999 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int n = input.length();
        int r = 1;
        int c = n;

        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                r = i;
                c = n / i;
            }
        }

        int index = 0;
        char[][] answer = new char[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                answer[j][i] = input.charAt(index++);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(answer[i][j]);
            }
        }

    }
}
