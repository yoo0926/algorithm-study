package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class AddCalc {
    public static void main(String agrs[]){
        try{
            //덧셈과정을 배열로 푸는 방법이 의도한 것 같긴하지만 자바는 BigInteger API로 쉽게 구현 가능함
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");

            BigInteger x = new BigInteger(str[0]);
            BigInteger y = new BigInteger(str[1]);

            BigInteger result = x.add(y);

            System.out.println(result);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
