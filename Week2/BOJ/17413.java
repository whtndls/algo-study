import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.contains("<")) {                              // tag 가 있는 경우
            String[] strs = input.split("[<>]");                // < 와 > 기준으로 문자 배열에 넣음
            for (int i=0; i<strs.length; i++) {

                if (i%2==0) {                                         // 짝수 index에는 tag가 아닌 문자(=거꾸로 출력해야함) or 공백 들어가있음 
                    if(!strs[i].equals("")) {                               //공백이 아닌 거꾸로 출력해야 하는 문자이면
                        String[] strsBetweenTag = strs[i].split(" ");       //공백을 기준으로 다시 문자열에 넣어줌
                        for (int j=0; j<strsBetweenTag.length; j++) {
                            String strBetweenTag = strsBetweenTag[j];
                            for(int k = strBetweenTag.length()-1; k>=0; k--) {      // char 하나씩 거꾸로 출력
                                System.out.print(strBetweenTag.charAt(k));
                            }
                            if(j<strsBetweenTag.length-1) {                         // 맨 마지막 문자가 아니면 공백 같이 출력
                                System.out.print(" ");
                            }
                        } 
                    } else {                                               // 공백은 아무조치 안하고 continue
                        continue;
                    }


                } else {                                             // 홀수 index에는 tag 문자 들어가 있음 (=꺽쇠와 함께 그대로 출력)
                   System.out.print("<"+strs[i]+">"); 
                }                
            }   



        } else {                                            // tag 없는 경우
            String[] strs = input.split(" ");
            for (int i =0; i<strs.length; i++) {           //공백기준 한 단어씩
                String str = strs[i];
                for (int j=str.length()-1; j>=0; j--) {    // char 하나씩 거꾸로 출력
                    System.out.print(str.charAt(j));
                }
                if (i<strs.length-1) {                     //맨 마지막 문자가 아니면 공백 같이 출력
                    System.out.print(" ");
                }
            }

        }

    }
}