package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

/**
 * 1260 DFS와 BFS
 * 실버2
 * */
public class BJ_1260 {
    static ArrayList<Integer>[] A; // 인접 리스트
    static boolean[] visited; // 방문 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수
        int v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호

        // 초기화
        A = new ArrayList[n + 1];
        for(int i=0; i<n+1; i++){
            A[i] = new ArrayList<>();
        }

        // 간선의 개수만큼 반복하여 인접 리스트에 저장
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        // 오름차순으로 정렬
        for(int i=0; i<n+1; i++){
            A[i].sort(Comparator.naturalOrder());
        }

        //DFS
        visited = new boolean[n + 1];
        DFS(v);
        System.out.println();

        //BFS
        visited = new boolean[n + 1];
        BFS(v);
        System.out.println();

    }

    static void DFS(int v){
        System.out.print(v + " ");
        visited[v] = true;
        for(int i : A[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }

    static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now + " ");
            for(int i : A[now]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
