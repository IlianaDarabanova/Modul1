package AdvancedExamRemake;

import java.util.Scanner;

public class AandB {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int A = scan.nextInt();
        int B = scan.nextInt();
        int temp;
        scan.nextLine();
        if(A>B){
            temp = A;
            A = B;
            B = temp;
        }
        int[] nums = {A, B};
        int[] array = new int[length];
        findCombinations(0,nums,length,array);
    }

    public static void findCombinations(int startIndex, int[] nums, int length, int[] array){
        if(startIndex == length){
           printArray(array);
            return;
        }

        for(int i = 0; i < nums.length; i++){
            array[startIndex] = nums[i];
            findCombinations(startIndex+1,nums,length,array);
        }
    }

    public static void printArray(int[] array){

        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
