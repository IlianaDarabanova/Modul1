package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetOfSumS {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = Integer.parseInt(scan.nextLine());
        boolean[] sums = new boolean[S+1];
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean hasSumS = hasSum(S,sums,numbers);
        if(hasSumS){
            System.out.println("yes");
        }
        else System.out.println("no");

    }

    public static boolean hasSum(int S,boolean[] sums, int[] numbers){
        sums[0] = true;
        boolean hasFound = false;
        int next_sum = 0;
        for(int number:numbers){
            for(int s = sums.length-1;s>-1;s--){
                if(sums[s]==true){
                    next_sum = s+number;
                }
                if(next_sum>S){
                    continue;
                }
                if(next_sum==S){
                    hasFound = true;
                    break;
                }
                sums[next_sum] = true;

            }
            if(hasFound){
                break;
            }
        }
        return hasFound;
    }
}
