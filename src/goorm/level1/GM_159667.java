package goorm.level1;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;


class GM_159667 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 출석부 전체 길이
        int k = Integer.parseInt(st.nextToken()); // 출력해야할 위치
        Attendance[] arr = new Attendance[n]; // 출석부 배열

        // 출석부 입력
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String tall = st.nextToken();
            arr[i] = new Attendance(name, tall);
        }
        // 출석부 정렬
        Arrays.sort(arr, new Comparator<Attendance>() {
            @Override
            public int compare(Attendance a1, Attendance a2){
                int name_order = a1.name.compareTo(a2.name); // 이름 알파벳순서 비교
                // 이름이 같으면 키 비교
                if(name_order == 0){
                    return a1.tall.compareTo(a2.tall);
                }else {
                    return name_order;
                }
            }
        });

        // k번째 출력
        String result = arr[k-1].name + " " + arr[k-1].tall;
        System.out.println(result);
    }

    // 출석부
    public static class Attendance {
        private String name; // 이름
        private String tall; // 키

        Attendance(String name, String tall){
            this.name = name;
            this.tall = tall;
        }
    }
}