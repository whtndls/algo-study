import java.util.*;

public class BOJ1260 {

    static int[][] graph;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = 1;
            graph[b][a] = 1;

        }

        dfs(v, n);
        visited = new boolean[n + 1];
        System.out.println();
        bfs(v, n);

    }


    private static void dfs(int v, int n) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i = 1; i <= n; i++) {
            if (graph[v][i] == 1 && visited[i] == false) {
                dfs(i, n);
            }
        }
    }

    private static void bfs(int v, int n) {
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            System.out.print(v + " ");
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
