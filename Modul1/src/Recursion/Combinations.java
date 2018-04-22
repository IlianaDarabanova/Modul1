package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int elementsCount = scan.nextInt();
       int k = scan.nextInt();
       int[] combination = new int[k];
        getCombinations(1,elementsCount,0,combination, k);
    }
    public static void getCombinations(int start,int N, int index, int[] combination, int k ){
    if(index==k){
        printArr(combination);
        return;
    }
        for(int n = start;n<=N;n++){
            combination[index] = n;
            getCombinations(n,N,index+1,combination,k);
        }

    }

    public static void printArr(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
