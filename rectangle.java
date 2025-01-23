package boj0123;
import java.util.*;
public class rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] answer = new String[4];
		for (int i = 0; i < 4; i++) {
			String s = sc.nextLine();
			String[] s_list = s.split(" ");
			double[] x = new double[4];
			double[] y = new double[4];
			double[] x_sorted = new double[4];
			double[] y_sorted = new double[4];
			for (int c = 0; c < 8; c++) {
				if (c%2==0) {
					x[c/2]=Double.parseDouble(s_list[c]);
					x_sorted[c/2]=Double.parseDouble(s_list[c]);
				}
				if (c%2==1) {
					y[c/2]=Double.parseDouble(s_list[c]);
					y_sorted[c/2]=Double.parseDouble(s_list[c]);
				}
			}
			Arrays.sort(x_sorted);
			Arrays.sort(y_sorted);
			double check_x = (x_sorted[1] + x_sorted[2]) / 2;
			double check_y = (y_sorted[1] + y_sorted[2]) / 2;
			int[] xy = new int[2];
			if ((x[0]<=check_x && check_x<x[1]) && (x[2]<=check_x && check_x<x[3])) {
				xy[0] = 2;
			}
			if (!(x[0]<=check_x && check_x<x[1]) && !(x[2]<=check_x && check_x<x[3])) {
				xy[0] = 0;
			}
			if (x[1] == x[2]) {
				xy[0] = 1;
			}
			if ((y[0]<=check_y && check_y<y[1]) && (y[2]<=check_y && check_y<y[3])) {
				xy[1] = 2;
			}
			if (!(y[0]<=check_y && check_y<y[1]) && !(y[2]<=check_y && check_y<y[3])) {
				xy[1] = 0;
			}
			if (y[1] == y[2]) {
				xy[1] = 1;
			}
			if (xy[0] == 2 && xy[1] == 2) {
				answer[i] = "a";
			}
			if (xy[0] == 0 || xy[1] == 0) {
				answer[i] = "d";
			}
			if (xy[0] == 1 && xy[1] == 1) {
				answer[i] = "c";
			}
			if ((xy[0] == 1 && xy[1] == 2) || (xy[0] == 2 && xy[1] == 1)) {
				answer[i] = "b";
			}
		}
		for (int v = 0; v < 4; v++) {
			System.out.println(answer[v]);
		}
		sc.close();
	}
}
