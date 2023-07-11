package hackerrank;

import java.util.Collections;
import java.util.List;

/**
 * Prepare > Interview Preparation Kits > 1 Week Preparation Kit > Day 1
 * */
public class MinMaxSum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr); // 오름차순 정렬
        long minSum = 0;
        long maxSum = 0;

        // 최소합
        for(int i = 0; i < arr.size() -1; i++){
            minSum += arr.get(i);
        }
        // 최대합
        maxSum = minSum - arr.get(0) + arr.get(arr.size()-1);

        System.out.println(minSum + " " + maxSum);
    }
}
