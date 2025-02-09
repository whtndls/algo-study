import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int headCnt = Integer.parseInt(str[0]);
        double K = Double.parseDouble(str[1]);
        int[][] cntStd = new int[2][6];

        while(sc.hasNextInt()) {
            int gender = sc.nextInt();
            int grade = sc.nextInt();
            cntStd[gender][grade-1]++;            
        }

        int hasStdRoom = 0;
        double extraRoom = 0;
        for (int i=0; i<2; i++) {
            for (int j=0; j<6; j++) {
                if (cntStd[i][j]!=0) {
                    hasStdRoom++;
                }
                if (cntStd[i][j]/K > 1) {
                    extraRoom += Math.ceil(cntStd[i][j]/K)-1;
                }                
            }
        }

        System.out.print(hasStdRoom+(int)extraRoom);        
    }
}