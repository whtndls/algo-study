import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] heights = br.readLine().split(" ");
        int[] heightInt = new int[N];
        int[] result = new int[N];

        for(int i = 0; i < N; i++) {
            heightInt[i] = Integer.parseInt(heights[i]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && heightInt[stack.peek()] < heightInt[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek() + 1;
            } else {
                result[i] = 0;
            }

            stack.push(i);
        }

        for(int i : result) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
