package programmers.level1;

import java.util.Stack;

/**
 * Programmers Level1
 * 크레인 인형뽑기 게임
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 * @author yoo92
 * @version 1.0
 */
public class PG_64061 {
    class Solution {
        /**
         *
         * @param board 전체 인형이 들어있는 배열
         * @param moves 크레인을 작동시키는 위치 배열
         * @return 크레인 작동 후 터트려서 사라진 인형의 개수
         */
        public int solution(int[][] board, int[] moves){
            Stack<Integer> busket = new Stack<>();
            int answer = 0;

            for(int m : moves){
                int doll = 0;
                for(int i=0; i<board.length;i++){
                    int check = board[i][m-1];
                    if (check != 0) {
                        doll = check;
                        board[i][m-1] = 0;
                        break;
                    }
                }
                if(!busket.empty()){
                    if(doll!=0){
                        if (busket.peek() == doll) {
                            busket.pop();
                            answer += 2;
                        }else{
                            busket.push(doll);
                        }
                    }
                }else{
                    busket.push(doll);
                }
            }
            return answer;
        }
    }
}
