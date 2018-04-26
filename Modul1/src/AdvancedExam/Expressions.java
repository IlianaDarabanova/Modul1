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
        int K = number.length() - 1;
        int result = Integer.parseInt(scan.nextLine());
        String[] combination = new String[K + number.length()];
        for (int i = 0, l = 0; i < number.length() && l < combination.length; i++, l = l + 2) {
            combination[l] = Character.toString(number.charAt(i));
        }
        String[] n = {"*", "+", "-", "_"};
        int count = 0;
        ArrayList<String> allComb = new ArrayList<>();
        findCombinations(1, combination, K, n, count, allComb);
        //allComb.forEach(System.out::println);
        conver(allComb, result);

    }

    public static void findCombinations(int startIndex, String[] combination, int K, String[] n, int count, ArrayList<String> all) throws ScriptException {

        if (startIndex == K + K + 1) {
            //print(combination);
            String my = "";
            for (int j = 0; j < combination.length; j++) {
                if (combination[j] == "_") {

                    continue;
                }
                my += combination[j];
            }
            all.add(my);

            return;
        }

        for (int i = 0; i < n.length; i++) {
            combination[startIndex] = n[i];
            findCombinations(startIndex + 2, combination, K, n, count, all);
        }
    }

    public static void conver(ArrayList<String> all, int result) {
        int counter = 0;
        StringBuilder my = new StringBuilder();
        int sum = 0;
        int num;
        char sign = '0';
        for (int i = 0; i < all.size(); i++) {
            String current = all.get(i);
            int z = 0;
            sign = '0';
            sum = 0;

            while (z < current.length()) {
                my = new StringBuilder();
                while (current.charAt(z) > 47 && current.charAt(z) < 58) {
                    my.append(current.charAt(z));
                    if (z == current.length() - 1) {
                        break;
                    }
                    z++;
                }

                String off = my.toString();
                if (off.length() > 1 && off.charAt(0) == '0') {
                    sum = Integer.MIN_VALUE;
                    break;
                }
                num = Integer.parseInt(off);
                if (sign != '0') {
                    switch (sign) {
                        case '*':
                            sum *= num;
                            break;
                        case '+':
                            sum += num;
                            break;
                        case '-':
                            sum -= num;
                            break;
                    }
                } else {
                    sum = num;
                }


                if (current.charAt(z) == '*' || current.charAt(z) == '+' || current.charAt(z) == '-') {
                    sign = current.charAt(z);
                }
                z++;
            }
            //  System.out.println(current + "="+sum);
            if (sum == result) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
//
//    public static void print(String[] comb){
//        for(int i = 0;i<comb.length;i++){
//            System.out.print(comb[i]);
//        }
//        System.out.println();
//    }
//
//    public static void conver(ArrayList<String> str, Integer number) throws ScriptException{
//
//
//
//    }

