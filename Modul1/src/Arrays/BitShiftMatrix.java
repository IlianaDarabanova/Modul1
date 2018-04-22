package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class BitShiftMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(reader.readLine());
        int C = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());
        int coeff = Math.max(R,C);
        String[] movesStr = reader.readLine().split(" ");
       int[] moves = new int[N];
        for(int i =0;i<movesStr.length;i++){
            moves[i]= Integer.parseInt(movesStr[i]);
        }
        boolean[][] visited = new boolean[R][C];
        goToTarget(R-1,0,moves,coeff,visited);
       // System.out.println(Long.MAX_VALUE);
    }

    public static int decodeRow(int coeff, int code){
        return code/coeff;

    }
    public static int decodeCol(int coeff, int code){
        return code%coeff;
    }

    public static void goToTarget(int startRow, int startCol, int[] moves, int coeff, boolean[][] visited){
        int currentRow= startRow;
        int currentCol= startCol;
        visited[currentRow][currentCol] = true;
        for(int nextCell = 0;nextCell<moves.length;nextCell++){
            int nextRow = decodeRow(coeff,moves[nextCell]);
            int nextCol = decodeCol(coeff,moves[nextCell]);
            while(currentCol !=nextCol){
                if(currentCol<nextCol){
                    currentCol++;
                }
                else if(currentCol>nextCol){
                    currentCol--;
                }

                visited[currentRow][currentCol] = true;

            }

            while(currentRow !=nextRow){
                if(currentRow<nextRow){
                    currentRow++;
                }
                else if(currentRow>nextRow){
                    currentRow--;
                }

                visited[currentRow][currentCol] = true;

            }



        }


        System.out.println(sumResult(visited).toString());

    }

    public static BigInteger sumResult(boolean[][] visited){
        BigInteger result = BigInteger.valueOf(0);


        for(int r = 0;r<visited.length;r++){
            for(int c = 0;c<visited[r].length;c++){
                if(!visited[r][c]){
                    continue;
                }

               result = result.add(BigInteger.valueOf(2).pow(visited.length-1-r+c));
            }
        }
        return result;
    }

}
