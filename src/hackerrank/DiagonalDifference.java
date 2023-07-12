package hackerrank;

import java.util.List;

/**
 * Prepare > Interview Preparation Kits > 1 Week Preparation Kit > Day 2
 * */
public class DiagonalDifference {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int primarySum = 0;
        int secondarySum = 0;

        for(int i=0; i<arr.size(); i++){
            primarySum += arr.get(i).get(i);
            secondarySum += arr.get(i).get(arr.get(i).size()-i-1);
        }

        return Math.abs(primarySum - secondarySum);
    }
}
