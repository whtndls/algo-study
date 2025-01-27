package algoStudy;

import java.util.Scanner;
import java.util.Stack;

public class BOJ10828 {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String str = sc.next();

            switch (str) {
                case "push" :
                    stack.push(sc.nextInt());
                    break;
                case "pop" :
                    System.out.println(
                            (stack.isEmpty()) ? -1 : stack.pop());
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(
                            (stack.isEmpty()) ? 1 : 0);
                    break;
                case "top":
                    System.out.println(
                            (stack.isEmpty()) ? -1 : stack.peek());
                    break;

            }

        }
    }
}
