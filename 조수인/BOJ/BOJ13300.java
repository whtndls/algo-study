import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ13300 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[][] answer = new int[7][2];


        for (int i = 0; i < n; i++) {
            String[] SandY = br.readLine().split(" ");
            int s = Integer.parseInt(SandY[0]);
            int y = Integer.parseInt(SandY[1]);

            answer[y][s]++;
        }


        int roomNum = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                if (answer[i][j] != 0 && (answer[i][j] % k) == 0) {
                    roomNum += (answer[i][j] / k);
                } else if (answer[i][j] != 0 && (answer[i][j] % k) != 0){
                    roomNum += (answer[i][j] / k + 1);
                }
            }
        }
        System.out.println(roomNum);
    }
}
