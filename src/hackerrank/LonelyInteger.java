package hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Prepare > Interview Preparation Kits > 1 Week Preparation Kit > Day 2
 * */
public class LonelyInteger {
    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int i : a){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(1 == entry.getValue()){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
