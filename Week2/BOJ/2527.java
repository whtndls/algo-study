import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=4; i++) {  //4줄 반복
            
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int p1 = sc.nextInt();
            int q1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int p2 = sc.nextInt();
            int q2 = sc.nextInt();
    
            while (true) {
            	//가로범위(x1, p1, x2, p2)가 아예 겹치는 경우 
            	if ((p1-x2>0 && x1-p2<0)||(p1-x2<0 && x1-p2>0)) {
            		if ((q1-y2>0 && y1-q2<0)||(q1-y2<0 && y1-q2>0)) { //세로범위(y1, q1, y2, q2)가 아예 겹치는 경우 
            			System.out.println("a");
            			break;
            		} else if ((y1==q2)||(q1==y2)) { //세로가 양 끝점이 딱 맞는 경우
            			System.out.println("b");
            			break;	
            		} else if ((q1-y2>0 && y1-q2>0)||(q1-y2<0 && y1-q2<0)) { //세로가 아예 안 겹치는 경우
            			System.out.println("d");
            			break;
            		}
            	}
            	//가로범위의 양 끝점이 딱 맞는 경우
            	if ((x1==p2)||(p1==x2)) {
            		if ((q1-y2>0 && y1-q2<0)||(q1-y2<0 && y1-q2>0)) { //세로가 아예 겹치는 경우 
            			System.out.println("b");
            			break;
            		} else if ((y1==q2)||(q1==y2)) { //세로가 양 끝점이 딱 맞는 경우(=두 사각형이 점에서 만나는 경우)
            			System.out.println("c");
            			break;	
            		} else if ((q1-y2>0 && y1-q2>0)||(q1-y2<0 && y1-q2<0)) { //세로 아예 안 겹치는 경우
            			System.out.println("d");
            			break;
            		}
            	}
            	// 가로 범위가 아예 겹치지 않는 경우
            	if ((p1-x2>0 && x1-p2>0)||(p1-x2<0 && x1-p2<0)) {
            	    System.out.println("d");
            	    break;
            	}
            }	

            
        }
    }
}