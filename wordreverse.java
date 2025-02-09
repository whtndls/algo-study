package boj;
import java.io.*;
import java.util.*;
public class wordreverse {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String word = sc.readLine();
		String[] arrWord = word.split("");
		String[] reverseWord = new String[arrWord.length];
		List<Integer> tag_start = new ArrayList<>();
		List<Integer> tag_finish = new ArrayList<>();
		List<Integer> space_bar = new ArrayList<>();
		for (int i = 0; i < arrWord.length; i++) {
			if (arrWord[i].equals("<")) {
				tag_start.add(i);
			}
			if (arrWord[i].equals(">")) {
				tag_finish.add(i);
			}
			if (arrWord[i].equals(" ")) {
				space_bar.add(i);
			}
		}
		for (int i = 0; i < tag_start.size(); i++) {
			for (int index = tag_start.get(i); index <= tag_finish.get(i); index++) {
				reverseWord[index] = arrWord[index];
			}
		}
		for (int c = 0; c < space_bar.size(); c++) {
			reverseWord[space_bar.get(c)] = " ";
		}
		List<Integer> null_start = new ArrayList<>();
		List<Integer> null_finish = new ArrayList<>();
		for (int k = 0; k < reverseWord.length; k++) {
			if (reverseWord[k] == null) {
				if (k == 0 || reverseWord[k-1] != null) {
					null_start.add(k);
				}
				if (k == (reverseWord.length - 1) || reverseWord[k+1] != null) {
					null_finish.add(k);
				}
			}
		}
		for (int i = 0; i < null_start.size(); i++) {
			for (int index = 0; index <= null_finish.get(i)-null_start.get(i); index++) {
				reverseWord[null_start.get(i)+index] = arrWord[null_finish.get(i)-index];
			}
		}
//		for (int c = 0; c < tag_start.size(); c++) {
//			if (c < tag_start.size()-1 && tag_start.get(c+1) - tag_finish.get(c) == 1) {
//				continue;
//			}
//			if (c == tag_start.size()-1) {
//				if (arrWord.length - tag_finish.get(c) != 1) {
//					for (int p = 1; p < arrWord.length - tag_finish.get(c); p++) {
//						reverseWord[tag_finish.get(c)+p] = arrWord[arrWord.length-p];
//					}
//				}
//			}
//			else {
//				for (int p = 1; p < tag_start.get(c+1) - tag_finish.get(c); p++) {
//					reverseWord[tag_finish.get(c)+p] = arrWord[tag_start.get(c+1)-p];
//				}
//			}
//		}
		String answer = "";
		for (int a = 0; a < reverseWord.length; a++) {
			answer = answer + reverseWord[a];
		}
		System.out.println(answer);
		sc.close();
	}
}

