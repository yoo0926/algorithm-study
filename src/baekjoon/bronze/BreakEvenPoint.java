package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        long fix = Long.parseUnsignedLong(st.nextToken()); //고정비용
        long variable = Long.parseUnsignedLong(st.nextToken()); //가변비용
        long cost = Long.parseUnsignedLong(st.nextToken()); //판매가격

        if(cost <= 1 || variable >= cost){
            System.out.println(-1);
        }else{
            long count = fix / (cost - variable) + 1;
            System.out.println(count);
        }
    }
}