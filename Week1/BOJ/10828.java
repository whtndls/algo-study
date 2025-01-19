import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();

        while (sc.hasNextLine()) {
            String userCmd = sc.nextLine();
            if (userCmd.contains("push")) {
                String[] userCmdPush = userCmd.split(" ");
                int userCmdValue = Integer.parseInt(userCmdPush[1]);
                stack.push(userCmdValue);
            }
            else if (userCmd.contains("pop")) {
                int userCmdPop;
                if (stack.isEmpty()) {
                    userCmdPop = -1;
                } else {
                    userCmdPop = stack.pop();
                }
                System.out.println(userCmdPop);
            }
            else if (userCmd.contains("size")) {
                System.out.println(stack.size());
            }
            else if (userCmd.contains("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else if (userCmd.contains("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }

        }

    }

}

