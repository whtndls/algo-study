package boj0123;
import java.util.*;
public class youngshik {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[] count = new int[n];
		count[0] = 1;
		int start = 0;
		int throwed = 0;
		for (int k = 1; k < n; k++) {
			count[k] = 0;
		}
		while(true) {
		    if (count[start] == m) {
		        break;
		    }
		    if (count[start] % 2 == 0) {
		        if (start - l < 0) {
		            count[n + start - l] += 1;
		            start = n + start - l;
		        } else {
		            count[start - l] += 1;
		            start = start - l;
		        }
		    } else {
		        count[(start + l) % n] += 1;
		        start = (start + l) % n;
		    }
		    throwed += 1;
		}		
		System.out.println(throwed);
		sc.close();
	}	
}

