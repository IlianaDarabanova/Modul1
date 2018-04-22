package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZag {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().split(" ");
        int rows = Integer.parseInt(nums[0]);
        int cols = Integer.parseInt(nums[1]);

        long result = findPath(rows,cols);
       System.out.println(result);

    }


    public static long findPath(int rows, int cols){
        long result = 0;

        int currentRow = 0;
        int currentCol = 0;
        result += 1+(3*(currentRow+currentCol));
        int rightRow = +1;
        while(currentCol<cols-1){
           currentCol++;
           currentRow += rightRow;
           rightRow*=-1;
            result +=  1+(3*(currentRow+currentCol));
        }

        while(currentCol!=0&&currentRow!=rows-1){
            int downCol = -1;
            int upCol = -1;
            while(currentRow<rows-1){
                currentRow++;
                currentCol += downCol;
                downCol*=-1;
                result +=  1+(3*(currentRow+currentCol));
            }
            while(currentRow > 1){
                if((currentCol==0&&currentRow==rows-1)){
                    break;
                }
                currentRow--;
                currentCol +=upCol;
                upCol*=-1;
                result +=  1+(3*(currentRow+currentCol));
            }
        }
        return result;
    }

}
