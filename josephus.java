package boj0123;
import java.util.*;
import java.io.*;
public class josephus {
	public static void main(String[] args) throws IOException{
		List<Integer> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int index = k-1;
		while(!list.isEmpty()) {
			sb.append(list.get(index));
			if (list.size() == 1) {
				sb.append(">");
			}
			else {
				sb.append(", ");
			}
			list.remove(list.get(index));
			if (list.size() != 0) {
				index = (index - 1 + k)%list.size();
			}
		}
		String answer = sb.toString();
		System.out.println(answer);
	}
}
