package Recursion;


import java.util.Scanner;

public class Permutations_recursion {
    public static int numberOfLoops;
    public static int numberOfIterations;
    public static long[] loops;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // System.out.print("N=");
        numberOfLoops = input.nextInt();

        // System.out.print("K=");
        numberOfIterations = numberOfLoops;

        loops = new long[numberOfLoops];
        nestedLoops(0);
    }

    public static void nestedLoops(int currentLoop){

        if(currentLoop==numberOfLoops){
            printLoops();
            return;
        }
        for (int counter = 1; counter <= numberOfIterations ; counter++) {
            loops[currentLoop] = counter;
            nestedLoops(currentLoop+1);

        }

    }

    public static void printLoops(){
        for(int i = 0; i<numberOfLoops;i++){
            System.out.printf("%d", loops[i]);
        }
        System.out.println();
    }
}
