package goorm.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구름 > 동명이인
public class GM_159181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken()); // 강의를 듣는 학생 수
        String name = st.nextToken(); // 구름이의 이름

        int result = 0;
        for(int i=0; i<count; i++){
            if(br.readLine().contains(name)){
                result++;
            }
        }

        System.out.println(result);
    }
}
