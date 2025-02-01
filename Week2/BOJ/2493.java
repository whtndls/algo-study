// 시간초과1

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        int[] tops = new int[N];
        int[] topsReceive = new int[N];
        
        for (int i=0; i<N; i++) {
            tops[i] = Integer.parseInt(input[i]);
        }
        
        for (int i=N-1; i>0; i--) {
	        for (int j=i-1; j>=0; j--) {
               if (tops[j]>=tops[i]) {
                 topsReceive[i] = j+1;
                 break;
               } else {
                   continue;
              }
            }
        }

        
        for (int i=0; i<N; i++) {
            if(i==N-1) {
                System.out.print(topsReceive[i]); 
            } else {
                System.out.print(topsReceive[i]+" ");
            }
        }
        

    }
}

// 시간초과2

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        int[] tops = new int[N];
        int[] topsReceive = new int[N];
        
        for (int i=0; i<N; i++) {
            tops[i] = Integer.parseInt(input[i]);
        }

        for (int i=1; i<N; i++) {
            if (tops[i-1]>=tops[i]) {
                topsReceive[i] = i; 
            } else {
                for (int j=i-2; j>=0; j--) {
                    if (tops[j]>=tops[i]) {
                        topsReceive[i] = j+1;
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }
        
        for (int i=0; i<N; i++) {
            if(i==N-1) {
                System.out.print(topsReceive[i]); 
            } else {
                System.out.print(topsReceive[i]+" ");
            }
        }
        

    }
}

// 시간초과3
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        int[] tops = new int[N];
        int[] topsReceive = new int[N];
        int topMax  = 0;
        int topMaxIdx = -1;
        
        for (int i=0; i<N; i++) {
            tops[i] = Integer.parseInt(input[i]);
        }

        for (int i=1; i<N; i++) {
            if (tops[i-1]>=tops[i]) {
                topsReceive[i] = i;
                if(topMax<=tops[i-1]) {
                    topMax = tops[i-1];
                    topMaxIdx = i-1;
                }                
            } else if (tops[i-1]<tops[i]) {
                if(topMax<=tops[i]) {
                    topMax = tops[i];
                    topMaxIdx = i;
                    topsReceive[i] = 0;
                } else {                             //(topMax>tops[i]) 
                   for (int j=i-2; j>=topMaxIdx; j--) {
                       if(tops[j]>=tops[i]) {
                           topsReceive[i] = j+1;
                           break;
                       } else {
                           continue;
                       }
                   } 
                }
            }
            
        }
        
        
        for (int i=0; i<N; i++) {
            if(i==N-1) {
                System.out.print(topsReceive[i]); 
            } else {
                System.out.print(topsReceive[i]+" ");
            }
        }
        

    }
}