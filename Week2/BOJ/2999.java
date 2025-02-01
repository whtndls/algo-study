import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int N = input.length();
        int rootR = (int)Math.floor(Math.sqrt(N));
        int R = 1; //초기화 할 때는 아예 나올 수 없는 값을 넣는게 나은지 
        int C = 1; // or 무조건 나오는 수(여기선 1)로 하는게 나은지 고민

        for (int r=rootR; r>0; r--) { //R*C=N에서 인수 찾을 때 제곱근 이하 중 가장 큰 수로 R 찾음 
            if(N%r==0) {
              R = r;
              C = N/R;
              break;  
            }
        }
        
        int n = 0;
        char[][] email = new char[R][C]; //char 2차원 배열 만들어서 각 문자 할당
        for (int i=0; i<C; i++) {
            for(int j=0; j<R; j++) {
                email[j][i] = input.charAt(n);
                n++; 
            }
        }

        for (int i=0; i<R; i++) { //각 행을 한번에 출력해서 반복문을 줄이려고 했지만,, replace 반복 참사
            System.out.print(Arrays.toString(email[i]).replace("[","").replace("]","").replace(",","").replace(" ",""));
        }
         

    }
}