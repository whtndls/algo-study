package boj0123;
import java.io.*;
import java.util.*;
public class roomdivide{
	static int[] result =  new int[12];
	static int sum = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st1.nextToken());
		int k = Integer.parseInt(st1.nextToken());
		for (int i = 0; i < n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st2.nextToken());
			int grade = Integer.parseInt(st2.nextToken());
			if (sex == 0) {
				result[grade-1] += 1;
			}
			if (sex == 1) {
				result[grade+5] += 1;
			}
		}
		for (int p = 0; p < result.length; p++) {
			sum = sum + (result[p] + k-1)/k;
		}
		System.out.println(sum);
	}
}


