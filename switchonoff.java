package boj0123;
import java.util.*;
public class switchonoff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int switch_count = sc.nextInt();
		List<Integer> switches = new ArrayList<>();
		for (int i = 0; i < switch_count; i++) {
			int onoff = sc.nextInt();
			switches.add(onoff);
		}
		int student_count = sc.nextInt();
		for (int j = 0; j < student_count; j++) {
			int student_sex = sc.nextInt();
			int switch_num = sc.nextInt();
			if (student_sex == 1) {
				int index = switch_num - 1;
				while (index < switch_count) {
					switches.set(index, 1-switches.get(index));					
					index = index + switch_num;
				}
			}
			if (student_sex == 2) {
				int index = switch_num - 1;
				switches.set(index, 1-switches.get(index));					
				int check = 1;
				while ((index-check) >= 0 && (index+check) < switch_count) {
					if (switches.get(index-check) != switches.get(index+check)) {
						break;
					} else {
						switches.set(index-check, 1-switches.get(index-check));					
						switches.set(index+check, 1-switches.get(index+check));
						check++;
					}
				}
			}
		}
        for (int i = 0; i < switch_count; i++) {
            System.out.print(switches.get(i) + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        if (switch_count % 20 != 0) {
            System.out.println();
        }
		sc.close();
	}
}

