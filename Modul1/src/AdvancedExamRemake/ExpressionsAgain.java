package AdvancedExamRemake;

import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpressionsAgain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int K = number.length()-1;
        int result = Integer.parseInt(scan.nextLine());
        String[] combination = new String[K+number.length()];
        for(int i = 0, l = 0;i<number.length() && l<combination.length ;i++,l=l+2){
            combination[l] = Character.toString(number.charAt(i));
        }
        String[] n = {"*","+","-","_"};
        ArrayList<String> allComb = new ArrayList<>();
        findCombinations(0, combination, K, n, allComb );
        allComb.forEach(System.out::println);
    }

    public static void findCombinations(int startIndex, String[] combination, int K , String[] n, ArrayList<String> all){

        if(startIndex == K+K+1){
            //print(combination);
            String my = "";
            for(int j =0;j<combination.length;j++){
                if(combination[j]=="_"){
                    continue;
                }
                my+=combination[j];
            }
            all.add(my);

            return;
        }

        for(int i = 0; i<n.length;i++){
            combination[startIndex] = n[i];
            findCombinations(startIndex+2,combination,K,n,all);
        }
    }


}
