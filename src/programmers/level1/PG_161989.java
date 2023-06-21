package programmers.level1;

// 코딩테스트 연습 > 연습문제 > 덧칠하기
public class PG_161989 {
    class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 1;

            int start = section[0];
            for(int sec : section){
                if(sec - start >= m){
                    start = sec;
                    answer++;
                }
            }

            return answer;
        }
    }
}
