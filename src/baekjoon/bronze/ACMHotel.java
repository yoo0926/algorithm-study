package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ACMHotel {

    public static void main(String args[]) {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());

            for(int i = 0; i < testCase; i++){
                String str = br.readLine();
                int height = Integer.parseInt(str.split(" ")[0]);
                int guest = Integer.parseInt(str.split(" ")[2]);

                int floor = guest % height;
                int number = guest / height;
                String room = "";
                if(floor == 0){
                    room = height + String.format("%02d",number);
                }else{
                    room = floor + String.format("%02d",number+1);
                }
                System.out.println(room);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
