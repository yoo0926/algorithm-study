package goorm.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class GM_191018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Integer> originList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 점수 입력
        while(st.hasMoreTokens()){
            originList.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> sortedList = new ArrayList<>(originList);

        // 점수 내림차순 정렬
        Collections.sort(sortedList, Collections.reverseOrder());
        String result = "";
        for(int i=0; i<3; i++){
            result += (originList.indexOf(sortedList.get(i)) + 1) + " ";
        }
        System.out.println(result.trim());
    }
}
