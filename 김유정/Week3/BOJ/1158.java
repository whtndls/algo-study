import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> numList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            numList.add(i+1);
        }
        
        int[] res = new int[N];
        int idx = 0;
        for (int i=0; i<N; i++) {
            idx = idx + (K-1);
            if (idx >= numList.size()) {
                idx = idx % numList.size();
            }
            res[i] = numList.get(idx);
            numList.remove(idx);
        }

        System.out.print(Arrays.toString(res).replace("[","<").replace("]",">"));

        sc.close();

    }
}