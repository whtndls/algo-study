import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] nums = sc.nextLine().split(" ");
        int prime_cnt = 0;        
        
        for (int i=0; i<N; i++) {
            int a = Integer.parseInt(nums[i]);
            int divisor_cnt = 0;
            for (int j=2; j<a; j++) {
	            if(a % j == 0 ) {
                    divisor_cnt += 1;
                }
            }
            if (divisor_cnt == 0 && a != 1) {
                prime_cnt += 1;                      
            }            
        }
        System.out.print(prime_cnt);      
    }
    
}