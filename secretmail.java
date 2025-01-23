package boj0123;

import java.util.*;
public class secretmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = sc.next();
		int len_message = message.length();
		String[] message_letter = message.split("");
		int r = 0;
		for (int i = 1; i <= (int)Math.sqrt(len_message); i++) {
			if (len_message % i == 0) {
				r = i;
			}
		}
		int c = len_message / r;
		String answer = "";
		for (int k = 0; k < r; k++) {
			for (int j = 0; j < c; j++) {
				answer = answer+message_letter[k+r*j];
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
