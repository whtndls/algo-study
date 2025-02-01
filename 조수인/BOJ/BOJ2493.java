import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Node {
    int index;
    int val;

    public Node(int index, int val) {
        this.index = index;
        this.val = val;
    }
}

public class BOJ2493 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[n];
        Node[] arr = new Node[n];
        Stack<Node> stack = new Stack<>();

        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = new Node(i, Integer.parseInt(inputs[i]));
        }

        stack.push(arr[n - 1]);
        for (int i = n - 1 - 1; i >= 0; i--) {
            // 서로 다른 크기의 타워이기때문에 같은 값은 생각하지 않아도 됨.
            while (!stack.isEmpty() && arr[i].val > (stack.peek()).val) {
                Node temp = stack.pop();
                answer[temp.index] = arr[i].index + 1;
            }
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            Node temp2 = stack.pop();
            answer[temp2.index] = 0;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}