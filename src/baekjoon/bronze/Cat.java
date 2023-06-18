package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cat {
    public static void main(String args[]){
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            String str = rd.readLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);

            System.out.println(a+b);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
