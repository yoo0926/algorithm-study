package hackerrank;

/**
 * Prepare > Interview Preparation Kits > 1 Week Preparation Kit > Day 3
 * */
public class TowerBreakers {
    /*
     * Complete the 'towerBreakers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int towerBreakers(int n, int m) {
        // Write your code here

        if(m == 1){ // 타워의 높이가 1이라면 1번이 먼저시작인데 나눌수 없으니 2번이 무조건 승리
            return 2;
        } else if(n % 2 == 0){ // 타워의 개수가 짝수라면 2번이 이긴다.
            return 2;
        } else { // 그 외는 1번이 이김
            return 1;
        }
    }
}
