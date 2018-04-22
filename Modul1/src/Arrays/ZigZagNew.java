package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagNew {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().split(" ");
        int rows = Integer.parseInt(nums[0]);
        int cols = Integer.parseInt(nums[1]);
        long result = 0;


       for(int r = 0 ; r < rows; r=r+2){
           for(int c = 0; c<cols;c=c+2){
               if(r==0 || r==rows-1 || c == 0 || c == cols-1){
               result+=(1+3*(r+c));}
               else{
                   result+=2*(1+3*(r+c));
               }
           }
       }
        for(int r = 1 ; r < rows; r=r+2){
            for(int c = 1; c<cols;c=c+2){
                if(r==0 || r==rows-1 || c == 0 || c == cols-1){
                    result+=(1+3*(r+c));}
                else{
                    result+=2*(1+3*(r+c));
                }
            }
        }
        System.out.println(result);

    }
}
