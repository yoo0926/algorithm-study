package hackerrank;

import java.util.Collections;
import java.util.List;

/**
 * Prepare > Interview Preparation Kits > 1 Week Preparation Kit > Day 1
 * */
public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        return arr.get(arr.size() / 2);
    }
}
