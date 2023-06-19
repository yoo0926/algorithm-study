package programmers.level1;

import java.util.Map;
import java.util.HashMap;

// 코딩테스트 연습 > 2022 KAKAO TECH INTERNSHIP > 성격 유형 검사하기
public class PG_118666 {
    class Solution {
        public String solution(String[] survey, int[] choices) {
            Map<String, Integer> map = new HashMap<>();

            // 질문별 점수 매기기
            for(int i=0; i<survey.length; i++){
                String[] arr = survey[i].split("");

                if(choices[i] < 4){
                    map.put(arr[0], map.getOrDefault(arr[0], 0) + (4 - choices[i]));
                } else if(choices[i] > 4){
                    map.put(arr[1], map.getOrDefault(arr[1], 0) + (choices[i] - 4));
                }
            }

            // 점수표대로 합산
            StringBuilder sb = new StringBuilder();

            sb.append(compareScore(map, "T","R"));
            sb.append(compareScore(map, "C","F"));
            sb.append(compareScore(map, "J","M"));
            sb.append(compareScore(map, "A","N"));

            return sb.toString();
        }

        // 결과비교
        private String compareScore(Map<String, Integer> map, String s1, String s2){
            Integer num1 = map.getOrDefault(s1, 0);
            Integer num2 = map.getOrDefault(s2, 0);

            int compare = num1.compareTo(num2);

            if(compare > 0) { // num1이 더 큼
                return s1;
            } else if(compare < 0) { // num2가 더 큼
                return s2;
            } else { // 같으면 알파벳 순서
                int strCompare = s1.compareTo(s2);
                if(strCompare < 0){
                    return s1;
                } else {
                    return s2;
                }
            }
        }
    }
}
