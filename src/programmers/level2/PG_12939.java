package programmers.level2;


// 코딩테스트 연습 > 연습문제 > 최댓값과 최솟값
public class PG_12939 {
    class Solution {
        public String solution(String s) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(String num : s.split(" ")){
                max = Math.max(max, Integer.parseInt(num));
                min = Math.min(min, Integer.parseInt(num));
            }

            return min + " " + max;
        }
    }
}
