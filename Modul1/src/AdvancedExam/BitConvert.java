package AdvancedExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BitConvert {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers =  Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        convertToBinaryUsingString(numbers);
    }

    public static void convertToBinaryUsingString(int[] arr) {
        StringBuilder kraenResult = new StringBuilder();
        for (int n = 0; n < arr.length; n++) {
            StringBuilder result = new StringBuilder();
            int i = 0;
            while (arr[n] > 0) {
                result.append(arr[n] % 2);
                i++;
                arr[n] = arr[n] / 2;
            }
            if (result.length() < 8) {
                while (result.length() != 8) {
                    result.append(0);
                }
            }
            result = result.reverse();
            if (n % 2 == 0) {
                kraenResult.append(getEvenPositionNumber(result));

            } else {
               kraenResult.append(getOddPositionNumber(result));
            }
        }
        System.out.println(kraenResult);
    }

    public static StringBuilder getEvenPositionNumber(StringBuilder str){
        StringBuilder newStr = new StringBuilder();
        for(int i = 1;i<str.length();i=i+2){
            newStr.append(str.charAt(i));
        }
        return newStr;
    }
    public static StringBuilder getOddPositionNumber(StringBuilder str){
        StringBuilder newStr = new StringBuilder();
        for(int i = 0;i<str.length();i=i+2){
            newStr.append(str.charAt(i));
        }
        return newStr;
    }
}
