package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Prepare > Interview Preparation Kits > 1 Week Preparation Kit > Day 2
 * */
public class CountingSort1 {
    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int[] result = new int[100];

        for(int i=0; i<arr.size(); i++){
            result[arr.get(i)] = result[arr.get(i)] + 1;
        }
        return Arrays.stream(result).boxed().collect(Collectors.toList());
    }
}
