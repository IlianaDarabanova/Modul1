package AdvancedExamRemake;

import java.util.Scanner;

public class JoroTheNaughty {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int jumps = scan.nextInt();
        scan.nextLine();
        int startRow = scan.nextInt();
        int startCol = scan.nextInt();
        scan.nextLine();
        int[] dRows = new int[jumps];
        int[] dCols = new int[jumps];
        for (int i = 0; i < jumps; i++) {
            String[] current = scan.nextLine().split(" ");
            dRows[i] = Integer.parseInt(current[0]);
            dCols[i] = Integer.parseInt(current[1]);
        }
        boolean[][] matrix = new boolean[rows][cols];
        move(matrix,startRow,startCol,dRows,dCols);
    }

    public static void move(boolean[][] matrix, int startRow, int startCol, int[] dRows, int[] dCols) {
        int currentRow = startRow;
        int currentCol = startCol;
        long sum = startRow*matrix[0].length + startCol+1;
        int nextRow;
        int nextCol;
        int jumps = 0;
        boolean hasEscaped = false;
        boolean isCaught = false;
            while(!hasEscaped && !isCaught) {
                for (int i = 0; i < dRows.length; i++) {
                    nextRow = currentRow + dRows[i];
                    nextCol = currentCol + dCols[i];
                    if (nextRow < 0 || nextRow > matrix.length - 1 || nextCol < 0 || nextCol > matrix[0].length - 1) {
                        System.out.println("escaped "+sum);
                        hasEscaped = true;
                        break;
                    }
                    if (matrix[nextRow][nextCol]) {
                        System.out.println("caught "+jumps);
                        isCaught = true;
                        break;
                    }
                    matrix[nextRow][nextCol] = true;
                    jumps++;
                    sum += (nextRow)*matrix[0].length + nextCol+1;
                    currentRow = nextRow;
                    currentCol = nextCol;
                }
            }


    }
}
