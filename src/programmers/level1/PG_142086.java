package programmers.level1;

import java.util.Map;
import java.util.HashMap;

// 코딩테스트 > 연습문제 > 가장 가까운 같은 글자
public class PG_142086 {
    class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            String[] arr = s.split("");
            Map<String, Integer> map = new HashMap<>();

            // 문자열을 순회하면서 나오는 문자열의 위치를 저장해두고
            // 중복해서 나올 경우 가장 최근 위치와의 거리를 저장
            for(int i=0; i<arr.length; i++){
                int index = map.getOrDefault(arr[i], -1);
                answer[i] = index != -1 ? i-index : index;
                map.put(arr[i], i);
            }

            return answer;
        }
    }
}
