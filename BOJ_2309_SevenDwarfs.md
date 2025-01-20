## #️⃣ 2 BOJ 2309 일곱 난쟁이

## 📝풀이
첫 풀이 (실패)
import java.util.*;

public class sevendwarf{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		ArrayList<Integer> answers = new ArrayList<>(10);
		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			count += num;
			answers.add(num);
		}
		int first = 0;
		int second = 0;
		for (int j = 0; j < 8; j++) {
			for (int k = 1; k < 9-j ; k++) {
				if (answers.get(j) + answers.get(j+k) == count-100) {
					first += answers.get(j);
					second += answers.get(j+k);
					break;
				}
			}
		}
		Collections.sort(answers);
		for (int o = 0; o < 9; o++) {
			if (answers.get(o) == first || answers.get(o) == second) {
				continue;
			} else {
				System.out.println(answers.get(o));
			}
		}
		
	}
}

두 번째 풀이 (성공)

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int sum = 0;
        
        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
            sum += heights[i];
        }
        
        outerLoop:
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - heights[i] - heights[j] == 100) {
                    // 두 난쟁이를 제외한 일곱 명 출력
                    List<Integer> result = new ArrayList<>();
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            result.add(heights[k]);
                        }
                    }
                    Collections.sort(result);
                    for (int num : result) {
                        System.out.println(num);
                    }
                    break outerLoop;
                }
            }
        }
        
        sc.close();
    }
}

처음에는 9개 값의 초기 배열 하나만 만들고, 2개의 값만 제외하여 출력하려 했으나 배열 정렬 과정에서 오답인 케이스가가 발생함.
따라서 아예 다른 배열을 하나 만들어 2개의 값을 제외한 나머지 7개 값을 추가한 배열을 재정렬하여 출력.

### 접근 방법

9명 중 7명의 합이 100 = 9명 키 합에서 특정 2명 키 합을 뺀 값이 100일 때
이중 반복문을 통해 인덱스 2개를 가져온다.
두 인덱스에 해당하는 값들의 합이 조건을 만족시키면, 그 2개만 제외하고 출력