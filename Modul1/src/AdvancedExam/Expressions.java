package AdvancedExam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Expressions {

    public static void main(String[] args) throws NumberFormatException, IOException, ScriptException {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int K = number.length()-1;
        int result = Integer.parseInt(scan.nextLine());
        String[] combination = new String[K+number.length()];
        for(int i = 0, l = 0;i<number.length() && l<combination.length ;i++,l=l+2){
            combination[l] = Character.toString(number.charAt(i));
        }
        //print(combination);

        String[] n = {"*","+","-","_"};

        int count = 0;

        ArrayList<String> allComb = new ArrayList<>();

        findCombinations(1,combination,K,n,count,allComb);
        int c = conver(allComb,result);
        System.out.println(c);
        allComb.forEach(System.out::println);

    }

    public static void findCombinations(int startIndex, String[] combination, int K , String[] n, int count, ArrayList<String> all) throws ScriptException{

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
            findCombinations(startIndex+2,combination,K,n, count,all);
        }
    }

    public static void print(String[] comb){
        for(int i = 0;i<comb.length;i++){
            System.out.print(comb[i]);
        }
        System.out.println();
    }

    public static int conver(ArrayList<String> str, Integer number) throws ScriptException{
        int counter = 0;
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        for(String m : str){

            Integer result =  (Integer) engine.eval(m);
            if(result.equals(number)){
                counter++;
            }


        }
        return counter;


    }
}