import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        

        int[] takeBall = new int[N];
        for (int i=0; i<N; i++) {
            takeBall[i] = 0;
        }
        takeBall[0] = 1;

        int index = 0;
        while (takeBall[index]<M) {
            if (takeBall[index] % 2 != 0) {  //홀수인 경우
                if(N <= index+L) {       //홀수이면서 배열길이 넘는 경우
                    index = index+L-N;
                } else {                 //홀수이면서 배열길이 내
                    index = index+L;
                }
            } else {                     //짝수인 경우
                if(index-L < 0) {        //짝수이면서 배열길이 넘는 경우
                    index = index-L+N;
                } else {
                    index = index-L;     //짝수이면서 배열길이 내
                }
            }
            takeBall[index]++;
        }

        int sum = 0;
        for (int j=0; j<N; j++) {
            sum += takeBall[j];
        } 
        System.out.print(sum-1); //공을 잡은 횟수 - (받기만 한 처음 1번)

    }

}