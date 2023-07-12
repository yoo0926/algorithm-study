package hackerrank;

/**
 * Prepare > Interview Preparation Kits > 1 Week Preparation Kit > Day 3
 * */
public class CaesarCipher {
    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        char[] arr = new char[s.length()];
        int index = 0;

        // 알파벳 1바퀴 이후는 의미 없으니 정리
        if(k > 26){
            k = k % 26;
        }

        for(char c : s.toCharArray()){
            if(65 <= c && c <= 90){
                // A ~ Z
                c += k;

                if(c > 90){
                    c -= 26;
                }

            }
            if(97 <= c && c <= 122){
                // a ~ z
                c += k;

                if(c > 122){
                    c -= 26;
                }
            }
            arr[index] = c;
            index++;
        }
        return new String(arr);
    }
}
