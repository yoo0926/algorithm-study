package programmers.level1;

import java.util.Arrays;

// 코딩테스트 > 연습문제 > 공원산책
public class PG_172928 {
    class Solution {
        int[] solution(String[] park, String[] routes) {
            // 공원의 크기
            int park_x = park[0].length() - 1;
            int park_y = park.length - 1;

            int start_x = 0;
            int start_y = 0;
            // 출발위치
            for(int i=0; i<park.length; i++){
                int s = park[i].indexOf("S");
                if(s != -1){
                    start_x = s;
                    start_y = i;
                    break;
                }
            }
            // 장애물 체크를 위한 임시변수
            int temp_x = start_x;
            int temp_y = start_y;
            boolean flag = true;
            // 명령 수행
            for(String route : routes){
                String dir = route.split(" ")[0]; //방향
                int len = Integer.parseInt(route.split(" ")[1]); //거리
                for(int i=0; i<len; i++){
                    if("E".equals(dir)){
                        temp_x++;
                    } else if("W".equals(dir)){
                        temp_x--;
                    } else if("S".equals(dir)){
                        temp_y++;
                    } else if("N".equals(dir)){
                        temp_y--;
                    }

                    // 공원 밖으로 나갔는지 확인
                    if((0 <= temp_x && temp_x <= park_x) && (0 <= temp_y && temp_y <= park_y)){
                        // 이동중 장애물 만났을 경우
                        char block = park[temp_y].charAt(temp_x);
                        if('X' == block){
                            flag = false;
                        }
                    } else {
                        flag = false;
                    }
                }
                // 이상이 없을때만 이동경로 적용;
                if(flag){
                    start_x = temp_x;
                    start_y = temp_y;
                }else{
                    temp_x = start_x;
                    temp_y = start_y;
                }

                flag = true;
            }

            return new int[] {start_y, start_x};
        }
    }
}