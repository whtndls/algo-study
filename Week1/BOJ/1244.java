import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        Boolean[] arrSwitch = new Boolean[N]; //스위치 불리언 배열 생성 (스위치 바로바로 바꿀 수 있는게 !불리언 밖에 생각 안났는데 다른 방법이 있을지)

        for (int i=0; i<N; i++) {
            if (arr[i].equals("1")) {
                arrSwitch[i] = true;
            } else {
                arrSwitch[i] = false;
            }        
        }

        int student = Integer.parseInt(sc.nextLine());
        int studentCnt = 1;
        while(studentCnt<=student) {
            String[] studentInfo = sc.nextLine().split(" ");
            int gender= Integer.parseInt(studentInfo[0]);
            int studentNum = Integer.parseInt(studentInfo[1]);

            if (gender==1) {   //남학생
                int j = 1;
                while (studentNum*j<=N) {
                    arrSwitch[studentNum*j-1] = !arrSwitch[studentNum*j-1];
                    j++;
                }
            } else if (gender==2) {  //여학생
                int k = 1;
                arrSwitch[studentNum-1] = !arrSwitch[studentNum-1];

                while (studentNum-k>=1 && studentNum+k<=N && arrSwitch[studentNum-1-k]==arrSwitch[studentNum-1+k]) {
                    arrSwitch[studentNum-1-k] = !arrSwitch[studentNum-1-k];
                    arrSwitch[studentNum-1+k] = !arrSwitch[studentNum-1+k];
                    k++;
                } 
                       
            }

            studentCnt++;
        }
        

        for (int i=0; i<N; i++) {
            if(arrSwitch[i]==true) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }


            if ((i+1)%20 == 0) {
            	System.out.print("\n");
            } else if (i<N-1) {
                System.out.print(" ");
            }
        }

        




    }



}