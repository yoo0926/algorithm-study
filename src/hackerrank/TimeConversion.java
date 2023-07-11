package hackerrank;

/**
 * Prepare > Interview Preparation Kits > 1 Week Preparation Kit > Day 1
 * */
public class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String[] arr = s.split(":");

        boolean isPM = "PM".equals(arr[2].substring(2));

        if(Integer.parseInt(arr[0]) == 12){
            if(!isPM){
                arr[0] = "00";
            }
        }else{
            if(isPM){
                int hour = Integer.parseInt(arr[0]) + 12;
                arr[0] = String.valueOf(hour);
            }
        }
        arr[2] = arr[2].substring(0,2);

        return String.join(":", arr);
    }
}
