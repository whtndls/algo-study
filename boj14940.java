package boj0123;
import java.util.*;
import java.io.*;
public class boj14940 {
	static int n,m;
	static int goalx;
	static int goaly;
	static List<int[]> graph;
	static List<boolean[]> visited;
	static Queue<int[]> queue;
	static void bfs(int startx, int starty) {
		 while(!queue.isEmpty()) {
			 int[] search = queue.poll();
			 int x = search[0];
			 int y = search[1];
			 if (x < m-1) {
				if (!visited.get(y)[x+1]) {
					if (graph.get(y)[x+1] == 1) {
						int[] xy = {x+1, y};
						queue.add(xy);
						graph.get(y)[x+1] = graph.get(y)[x] + 1;
						visited.get(y)[x+1] = true;
					}
					if (graph.get(y)[x+1] == 0) {
						visited.get(y)[x+1] = true;
					}
				}
				
			 }
			 if (x > 0) {
				 if (!visited.get(y)[x-1]) {
					 if (graph.get(y)[x-1] == 1) {
							int[] xy = {x-1, y};
							queue.add(xy);
							graph.get(y)[x-1] = graph.get(y)[x] + 1;
							visited.get(y)[x-1] = true;
						} 
					 if (graph.get(y)[x-1] == 0) {
							visited.get(y)[x-1] = true;
						}
				 }
					
			 }
			 if (y < n-1) {
				 if (!visited.get(y+1)[x]) {
					 if (graph.get(y+1)[x] == 1) {
							int[] xy = {x, y+1};
							queue.add(xy);
							graph.get(y+1)[x] = graph.get(y)[x] + 1;
							visited.get(y+1)[x] = true;
						}
					 if (graph.get(y+1)[x] == 1) {
							visited.get(y+1)[x] = true;
						} 
				 }
			 }
			 if (y > 0) {
				 if (!visited.get(y-1)[x]) {
					 if (graph.get(y-1)[x] == 1) {
							int[] xy = {x, y-1};
							queue.add(xy);
							graph.get(y-1)[x] = graph.get(y)[x] + 1;
							visited.get(y-1)[x] = true;
						}
					 if (graph.get(y-1)[x] == 1) {
							visited.get(y-1)[x] = true;
						} 
				 }
			 }
		 }
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st1.nextToken());
		m = Integer.parseInt(st1.nextToken());
		graph = new ArrayList<>();
		visited = new ArrayList<>();
		queue = new LinkedList<>();
		for (int j = 0; j < n; j++) {
			boolean[] visit = new boolean[m];
			visited.add(visit);
			int[] nums = new int[m];
			int index = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				nums[index] = Integer.parseInt(st.nextToken());
				if (nums[index] == 2) {
					goalx = index;
					goaly = j;
				}
				index++;
			}
			graph.add(nums);
		}
		graph.get(goaly)[goalx] = 0;
		visited.get(goaly)[goalx] = true;
		int[] xy = {goalx, goaly};
		queue.add(xy);
		bfs(goalx, goaly);
		for (int k = 0; k < n; k++) {
			StringBuilder sb = new StringBuilder();
			for (int c = 0; c < m; c++) {
				if (!visited.get(k)[c] && graph.get(k)[c] == 1) {
					sb.append(-1);
				} else {
					sb.append(graph.get(k)[c]);
				}
				if (c == m-1) {
					System.out.println(sb.toString());
				} else {
					sb.append(" ");
				}
			}
		}
	}
}
