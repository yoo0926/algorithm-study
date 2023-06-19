package baekjoon.platinum;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 11003 최솟값 찾기
 * 플래티넘5
 * */
public class BJ_11003 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 데이터 개수
        int L = Integer.parseInt(st.nextToken()); // 최소값을 구하는 범위
        st = new StringTokenizer(br.readLine());

        Deque<Node> mydeque = new LinkedList<>();
        for(int i=0; i < N; i++){
            int now = Integer.parseInt(st.nextToken());
            // 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간복잡도를 줄인다.

            while(!mydeque.isEmpty() && mydeque.getLast().value >= now){
                mydeque.removeLast();
            }
            mydeque.addLast(new Node(i, now));
            // 범위에서 벗어난 값은 덱에서 제거
            if(mydeque.getFirst().index <= i - L){
                mydeque.removeFirst();
            }
            bw.write(mydeque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }
    static class Node {
        int index;
        long value;
        Node(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
}