package Loops;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Legs {

    public static void main(String[] args) throws NumberFormatException, IOException {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int[] animalsLegs ={7,2,5};
        int[] allLegs = new int[N+1];
        int count = 0;
        allLegs[0] = 1;
        int next_sum=0;
        for(int animal : animalsLegs){
            for(int sumOfLegs = allLegs.length-1;sumOfLegs>-1;sumOfLegs--){
                if(allLegs[sumOfLegs]==0){
                    continue;
                }

                    next_sum = sumOfLegs+animal;
                    if(next_sum>N){
                        continue;
                    }
                    allLegs[next_sum] += allLegs[sumOfLegs];



            }
        }
        System.out.println(allLegs[N]);
    }

}