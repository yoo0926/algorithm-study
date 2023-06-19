package baekjoon.silver;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 1874 스택 수열
 * 실버2
 */

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 수열의 길이
        int[] arr = new int[n];
        // 수열 채우기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int num = 1; // 오름차순 자연수
        boolean flag = true;
        Stack<Integer> stack = new Stack<>();

        // 수열의 값과 오름차순 자연수를 비교하면서 stack에 저장
        for (int i = 0; i < arr.length; i++) {
            int arrNum = arr[i];
            if (arrNum >= num) {
                while (arrNum >= num) {
                    stack.push(num);
                    sb.append("+\n");
                    num++;
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int popNum = stack.pop();
                if (popNum > arrNum) {
                    System.out.println("NO");
                    flag = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if (flag) {
            System.out.println(sb.toString());
        }
    }
}