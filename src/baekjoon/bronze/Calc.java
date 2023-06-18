package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Calc {
    public static void main(String args[]){
        try{
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            String str = rd.readLine();
            int a = Integer.parseInt(str);
            str = rd.readLine();
            String[] b = str.split("");

            ArrayList<Integer> list = new ArrayList<>();

            for(int i = b.length-1; i >= 0; i--){
                int num = a * Integer.parseInt(b[i]);
                list.add(num);
                System.out.println(num);
            }

            int result = 0;
            for(int i = 0; i < list.size(); i++){
                result += list.get(i) * (int)Math.pow(10,i);
            }
            System.out.println(result);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}