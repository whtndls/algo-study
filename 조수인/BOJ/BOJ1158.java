import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        boolean[] arr = new boolean[n];
        ArrayList<Integer> answer = new ArrayList<>();

        int index = 0;
        while (answer.size() != n) {
            int cnt = 0;
            while (cnt < k) {
                if (arr[index] == false) cnt++;
                if (cnt == k) break;
                index++;
                if (index >= n) {
                    index = index % n;
                }
            }

            arr[index] = true;
            answer.add(index + 1);
            index++;
            if (index >= n) {
                index = index % n;
            }
        }

        sb.append("<");
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i));
            if (i != answer.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
