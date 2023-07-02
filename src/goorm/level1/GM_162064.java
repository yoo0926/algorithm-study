package goorm.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 구름 > 7게임
public class GM_162064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 5번
        for(int i=0; i<5; i++){
            String[] input = br.readLine().split("");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            int result = 0;
            for(int j=0; j<arr.length; j++){
                // 홀수번째 더하기
                if(j % 2 == 0){
                    result += arr[j];
                }
            }
            for(int k=0; k<arr.length; k++){
                // 짝수번째 곱하기
                if(k % 2 != 0 && arr[k] != 0){
                    result = result * arr[k];
                }
            }
            sb.append(result%10).append("\n");
        }
        System.out.println(sb.toString());
    }
}
