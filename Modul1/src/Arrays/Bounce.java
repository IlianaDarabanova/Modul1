package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bounce {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        int N = Integer.parseInt(numbers[0]);
        int M = Integer.parseInt(numbers[1]);
        //System.out.println(1<<3);
        System.out.println(sumPaths(N,M));
        //	System.out.println(Long.MAX_VALUE);

    }

    public static BigInteger sumPaths(int rows, int cols){
        BigInteger result = BigInteger.valueOf(0);
        int dCol = +1;
        int dRow = +1;
        int row = 0;
        int col = 0;
        result=result.add(getValue(row,col));


        while(!isCorner(row,col,rows,cols) || result.equals(BigInteger.ONE)){
            if(rows==1||cols==1){
                break;
            }
            int nextRow = row+dRow;
            int nextCol = col+dCol;
            if(nextRow>rows-1 || nextRow<0){
                dRow *=-1;
            }
            if(nextCol>cols-1 || nextCol < 0){
                dCol *=-1;
            }

            row += dRow;
            col += dCol;
            result=result.add(getValue(row,col));

        }
        return result;
    }

    private static BigInteger getValue(int row, int col) {

        return BigInteger.valueOf(2).pow(row+col);
    }

    private static boolean isCorner(int row, int col, int rows, int cols) {
        if ((row == 0 && col ==0) ||
                (row == rows-1 && col == 0) ||
                (row == 0 && col == cols-1) ||
                (row == rows-1 && col == cols-1)){
            return true;
        }
        else return false;



    }

}