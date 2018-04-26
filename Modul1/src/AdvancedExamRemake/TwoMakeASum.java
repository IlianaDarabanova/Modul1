package AdvancedExamRemake;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TwoMakeASum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        String[] sumsStr = scan.nextLine().split(" ");
        int[] sums = new int[sumsStr.length];
        for (int i = 0; i < sumsStr.length; i++) {
            sums[i] = Integer.parseInt(sumsStr[i]);
        }
        int count = 0;
        HashSet<Integer> allSums = getAllSums(numbers);
        for(int s =0;s<sums.length;s++){
         if (allSums.contains(sums[s])){
              count++;
            }
        }
        System.out.println(count);

    }

    public static HashSet<Integer> getAllSums(int[] numbers){
        HashSet<Integer> sums = new HashSet<>();
        for(int i = 0;i < numbers.length-1;i++){
            for(int j  =i+1; j <numbers.length;j++){
                sums.add(numbers[i]+numbers[j]);
            }
        }
        return sums;
    }
}


//  }