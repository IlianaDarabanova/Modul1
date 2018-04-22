package Recursion;

import java.util.Scanner;

public class CombinationsWithOutRepet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] combination = new int[K];
    getCombinations(0,K,1,N,combination);
    }

    public static void getCombinations(int index, int k, int start, int N, int[] combination){
        if(index==k){
            printArr(combination);
            return;
        }
        for(int i = start; i<=N;i++){
            combination[index] = i;
            getCombinations(index+1,k,i+1,N,combination);
        }

    }
    public static void printArr(int[] array){
        for(int number: array){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
