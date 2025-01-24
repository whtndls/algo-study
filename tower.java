package boj;
import java.io.*;
public class tower {
	public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String num = sc.readLine();
		int n = Integer.parseInt(num);
		int[] index_list = new int[n];
		int[] height_list = new int[n];
		int max = 0;
		String s = sc.readLine();
		String[] arr = s.split(" ");
		for (int k = 0; k < n; k++) {
			height_list[k] = Integer.parseInt(arr[k]);
			if (height_list[k] > max) {
				max = height_list[k];
				index_list[k] = 0;
			}
			if (height_list[k] < max) {
				int index = k - 1;
				while(true) {
					if(height_list[index] > height_list[k]) {
						index_list[k] = index + 1;
						break;
					}
					if (height_list[index] < height_list[k]) {
						int org_index = index;
						index = index_list[org_index] - 1;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(index_list[i]+" ");
		}
		sc.close();
	}
}
