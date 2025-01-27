import java.util.Scanner;
import java.util.Stack;

public class BOJ17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '<') {

                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                while (arr[i] != '>') {
                    System.out.print(arr[i]);
                    i++;
                }
                System.out.print(arr[i]);
            } else if (arr[i] == ' ') {

                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(' ');
            } else {
                stack.push(arr[i]);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
