## #️⃣ {#1} {BOJ 1978 소수찾기}

## 📝풀이
import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int j = 0; j < N; j++) {
			int num = sc.nextInt();
			if (num >= 3) {
				if (num % 2 == 0) {
					continue;
				} else {
					for (int i = 2; i < num; i++) {
						if (num % i == 0) {
							break;
						} else {
							if (i == num-1) {
								count += 1;
							}
						}
					}
				}
			} else if (num == 2) {
				count += 1;
			} else {
				continue;
			}
		}
		System.out.println(count);
		sc.close();
	}
}

-3 이상의 짝수는 무조건 소수가 아니다.
-2는 유일한 소수인 짝수
-1은 소수가 아님
-3 이상의 홀수에 대해서 반복문을 통해 (2부터 n-1까지) 나머지 체크

### 접근 방법
-if-else 를 통해 각 네 개의 케이스 중 하나로 들어간다.
1이면 continue
2이면 소수 하나 카운트
3이상 짝수면 continue
3이상 홀수는 for 2~n-1 반복문으로 나머지. 중간에 나머지 0 발생하면 바로 break하고 소수 카운트 안함.
