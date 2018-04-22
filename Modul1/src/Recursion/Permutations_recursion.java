package Recursion;


import java.util.Scanner;

public class Permutations_recursion {
    public static int K;
    public static int N;
    public static long[] loops;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // System.out.print("N=");
        N = input.nextInt();

        // System.out.print("K=");
        K = input.nextInt();

        loops = new long[K];
        combinations(0,1);
    }

    public static void combinations(int index, int number){

        if(index==K){
            printLoops();
            return;
        }
        for (int counter = number; counter <= N ; counter++) {

            loops[index] = counter;
            combinations(index+1,number);

        }

    }

    public static void printLoops(){
        for(int i = 0; i<K;i++){
            System.out.printf("%d", loops[i]);
        }
        System.out.println();
    }
}
