import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ14940 {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] map;
    static int[][] answer;
    static Queue<int[]> queue;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        answer = new int[n][m];
        queue = new LinkedList<>();
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 0) {
                    answer[i][j] = 0;
                } else {
                    answer[i][j] = -1;
                }
                if (map[i][j] == 2) {
                    x = i;
                    y = j;
                }
            }
        }

        bfs(x, y);

        for (int[] ints : answer) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

    private static void bfs(int x, int y) {
        queue.add(new int[]{x, y});
        answer[x][y] = 0;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int cx = arr[0];
            int cy = arr[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (map[nx][ny] == 0) continue;
                if (answer[nx][ny] != -1) continue;

                queue.add(new int[]{nx, ny});
                answer[nx][ny] = answer[cx][cy] + 1;
            }

        }
    }


}
