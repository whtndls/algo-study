import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0;

        for (int i=0; i<9; i++) {
            int num = sc.nextInt();
            nums.add(num);
            sum += num;
        }
        
        int sumExcess = sum - 100;
        boolean exit = false;

        for (int j=0; j<8; j++) {
            int a = nums.get(j);
            for (int k=8; k>j; k--) {
                int b = nums.get(k);
                if(a+b == sumExcess) {
                    exit = true;
                    nums.remove(nums.indexOf(a));
                    nums.remove(nums.indexOf(b));
                    break;
                }
            }
            if (exit) {
                break;
            }
        }

        Collections.sort(nums);
        for (int num : nums) {
            System.out.println((num));
        }

    }
}