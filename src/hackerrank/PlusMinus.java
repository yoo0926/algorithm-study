package hackerrank;

import java.util.*;

/**
 * Prepare > Interview Preparation Kits > 1 Week Preparation Kit > Day 1
 * */
public class PlusMinus {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        StringBuilder sb = new StringBuilder();

        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;
        for(int num : arr){
            if(num > 0){
                positive++;
            } else if(num < 0){
                negative++;
            } else {
                zero++;
            }
        }
        sb.append(String.format("%.6f", positive / arr.size())).append("\n");
        sb.append(String.format("%.6f", negative / arr.size())).append("\n");
        sb.append(String.format("%.6f", zero / arr.size()));

        System.out.println(sb.toString());
    }
}