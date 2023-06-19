package programmers.level1;

// 코딩테스트 > 연습문제 > 크기가 작은 부분문자열
public class PG_147355 {
    class Solution {
        public int solution(String t, String p) {
            int pSize = p.length();
            long pNum = Long.parseLong(p);
            int answer = 0;

            for(int i=0; i <= t.length() - p.length(); i++){
                // p보다 작거나 같은 숫자의 개수
                if(Long.parseLong(t.substring(i, i + pSize)) <= pNum){
                    answer++;
                }
            }

            return answer;
        }
    }
}
