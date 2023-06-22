package programmers.level2;

import java.lang.StringBuilder;

// 코딩테스트 연습 > 연습문제 > JadenCase 문자열 만들기
public class PG_12951 {
    static class Solution {
        public String solution(String s) {
            StringBuilder sb = new StringBuilder();

            // 일단 모두 소문자로 변환
            String[] lower = s.toLowerCase().split(" ");

            for(String str : lower){
                // 공백문자가 연속으로 나올 수 있음
                if(str.length() > 0){
                    sb.append(str.substring(0, 1).toUpperCase());
                    // 1글자만 들어올 수 있음
                    if(str.length() > 1){
                        sb.append(str.substring(1));
                    }
                }
                sb.append(" ");
            }

            // 불필요한 공백 지우기
            if(s.length() < sb.length()){
                sb.deleteCharAt(sb.lastIndexOf(" "));
            }

            return sb.toString();
        }
    }
}
