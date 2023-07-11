package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class PG_140108 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            String[] arr = s.split("");
            Map<String, Integer> map = new HashMap<>();
            int count = 0;

            String first = "";
            for (int i = 0; i < arr.length; i++) {
                if (map.size() < 1) {
                    // 첫 글자
                    first = arr[i];
                    map.put(arr[i], 1);
                } else if (arr[i].equals(first)) {
                    // 첫 글자랑 동일한 문자
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    // 첫 글자랑 다른 나머지 문자들
                    count++;
                }

                // 횟수 동일하여 분해
                if (map.get(first) == count) {
                    first = "";
                    count = 0;
                    answer++;
                    map = new HashMap<>();
                } else if (i == arr.length - 1) {
                    // 더이상 읽을 글자 없어서 분리
                    answer++;
                }
            }

            return answer;
        }
    }
}
