package programmers.level1;

import java.lang.StringBuilder;

// 코딩테스트 연습 > 연습문제 > 푸드 파이트 대회
public class PG_134240 {
    class Solution {
        public String solution(int[] food) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<food.length; i++){
                int num = food[i] / 2;
                if(num != 0){
                    for (int j=0; j<num; j++){
                        sb.append(i);
                    }
                }
            }
            return sb.toString() + "0" + sb.reverse().toString();
        }
    }
}
