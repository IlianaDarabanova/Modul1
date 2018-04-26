package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MessageInBottle {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        String code = scan.nextLine();
        String cipher = scan.nextLine();
        ArrayList<String> letters = new ArrayList<>();
        ArrayList<String> numsForLetters = new ArrayList<>();
        ArrayList<String> needed = new ArrayList<>();
        HashSet<String> nums = new HashSet<>();
        readSecretMessage(cipher, letters, numsForLetters, nums);
        HashSet<String> allSubstrings = new HashSet<>();
        substrings(0,1,code,allSubstrings);
        ArrayList<String> allComb = new ArrayList<>();
        for(String str : allSubstrings){
            allComb.add(str);
        }
      //  saveNeeded(allSubstrings,nums,needed);
        allComb.sort(String::compareToIgnoreCase);
        //allComb.forEach(System.out::println);
        //decode();


    }

    public static void combineSubstring(ArrayList<String> needed, String code, ArrayList<String> letterCode){


    }
    public static void decode(String code, ArrayList<String> letters, ArrayList<String> numsForLetters, StringBuilder decoded, String msg){

        for(int i = 0 ; i< code.length();i++){
            if(numsForLetters.contains(code.substring(0,i))){
                int indexM = numsForLetters.indexOf(code.substring(0,i));
                msg += letters.get(indexM);
            }
        }
        System.out.println(msg);
    }

    public static void saveNeeded(HashSet<String> all, HashSet<String> numsForLetters, ArrayList<String> needed){
        for(String str : all)
            {
                if(!numsForLetters.contains(str)){
                    continue;
            }
            needed.add(str);
        }
    }


    public static void substrings(int start, int end, String in, HashSet<String> allSubstrings){
        if(start == in.length() && end == in.length()){
            return;
        }else{
            if(end == in.length()+1){
                substrings(start+1,start+1,in,allSubstrings);
            }else{

                allSubstrings.add(in.substring(start,end));
                //System.out.println(in.substring(start, end));
                substrings(start, end+1,in,allSubstrings);
            }
        }
    }

    public static void readSecretMessage(String code, ArrayList<String> letters, ArrayList<String> numsForLetters, HashSet<String> nums ){

        String num = "";
        for(int i = 0 ; i <code.length();i++){
            if(Character.isLetter(code.charAt(i))){
                if(!num.isEmpty()){
                numsForLetters.add(num);
                nums.add(num);
                num = "";}
                if(Character.isLetter(code.charAt(i))){
                letters.add(Character.toString(code.charAt(i)));}
            }
            else if(Character.isDigit(code.charAt(i))){
                num += code.charAt(i);
            }
        }
        numsForLetters.add(num);
        nums.add(num);

//        for(int i =0;i<letters.size();i++){
//            System.out.println(i+": "+letters.get(i));
//        }
//        for(int i =0;i<numsForLetters.size();i++){
//            System.out.println(i+": "+numsForLetters.get(i));
//        }

    }
}
