package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 11724 연결 요소의 개수
 * 실버2
 */
public class BJ_11724 {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        // 인접 리스트 초기화
        for(int i=0; i<n + 1; i++){
            A[i] = new ArrayList<>();
        }

        // 인접 리스트에 그래프 데이터 저장
        for(int i=0; i<m; i++){
            input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int e = Integer.parseInt(input[1]);
            A[s].add(e); // 양방향 엣지라서 양쪽에 모두 더하기
            A[e].add(s);
        }
        int count = 0;
        for(int i=1; i<n+1; i++){
            if(!visited[i]){ // 방문하지 않은 노드가 없을 때까지 반복
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if(!visited[i]){ // 연결 노드 중 방문하지 않았던 노드만 탐색
                DFS(i);
            }
        }
    }
}
