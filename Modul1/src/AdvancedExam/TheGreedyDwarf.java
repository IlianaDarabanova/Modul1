package AdvancedExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TheGreedyDwarf {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int rows = Integer.parseInt(str[0]);
        int cols = Integer.parseInt(str[1]);
        int[][] labirint = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            labirint[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }
      int sum =  collectCoins(labirint);
        System.out.println(sum);
       // printMatrix(labirint);
    }

    public static int collectCoins(int[][] matrix){
        int collectedCoins = 0;
        int currentRow = getStartRow(matrix);
        int currentCol = getStartCol(matrix);
        int[] dRows = {0,0,-1,+1};
        int[] dCols = {-1,+1,0,0};
        int nextRow;
        int nextCol;
        int bestCol = Integer.MIN_VALUE;
        int bestRow = Integer.MIN_VALUE;
        int bestCell = Integer.MIN_VALUE;

        while(bestCell!=0) {
            bestCell = 0;
            for (int move = 0; move < dRows.length; move++) {

                nextRow = currentRow + dRows[move];
                nextCol = currentCol + dCols[move];
                if (nextRow < 0 || nextRow > matrix.length-1 || nextCol < 0 || nextCol > matrix[0].length-1) {
                    continue;
                }
                if (matrix[nextRow][nextCol] > bestCell) {
                    bestRow = nextRow;
                    bestCol = nextCol;
                    bestCell = matrix[bestRow][bestCol];
                }
            }

            currentRow = bestRow;
            currentCol = bestCol;
            if(bestCell!=0) {
                matrix[currentRow][currentCol]--;
                collectedCoins++;
            }
        }

        return collectedCoins;
    }

    public static int getStartRow(int[][] matrix){
        int startRow = 0;
        int startCol = 0;
        boolean isFound = false;
        for(int row= 0 ; row<matrix.length;row++){
            for (int col = 0;col<matrix[row].length;col++){
               if(matrix[row][col]!=0){
                   continue;
               }
               startRow=row;
               startCol = col;
               isFound = true;
               break;

            }
         if(isFound){
                break;
         }
        }
        return startRow;
    }
    public static int getStartCol(int[][] matrix){
        int startRow = 0;
        int startCol = 0;
        boolean isFound = false;
        for(int row= 0 ; row<matrix.length;row++){
            for (int col = 0;col<matrix[row].length;col++){
                if(matrix[row][col]!=0){
                    continue;
                }
                startRow=row;
                startCol = col;
                isFound = true;
                break;

            }
            if(isFound){
                break;
            }
        }
        return startCol;
    }

    public static void printMatrix(int[][] matrix ){
        for(int row= 0 ; row<matrix.length;row++){
            for (int col = 0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" " );
            }
            System.out.println();
        }
    }
}
