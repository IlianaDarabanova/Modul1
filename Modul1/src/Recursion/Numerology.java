package Recursion;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Numerology {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Read the number
        String NumberStr = reader.readLine();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int strElements = 0; strElements < NumberStr.length(); strElements++) {
            char current = NumberStr.charAt(strElements);
            numbers.add(current - '0');
        }
        int[] counts = new int[10];
        calculateNum(numbers,counts);
        printArr(counts);
    }

    public static int solve(int a, int b) {
        return (a + b) * (a ^ b) % 10;
    }

    public static void calculateNum(ArrayList<Integer> array, int[] counts){
        //System.out.println(array);
        if(array.size()==1){
            int number = array.get(0);
            counts[number] +=1;
            //System.out.print(array+" ");

            return;
        }


        for(int index = 0;index<array.size()-1;index++){

            int a = array.get(index);
            int b = array.get(index+1);
            int result = (a + b) * (a ^ b) % 10;
            array.set(index, result);
            array.remove(index+1);
            //ArrayList<Integer> secondNumber = new ArrayList<Integer>(array.subList(1, array.size()-1));

            calculateNum(array, counts);
            array.set(index, a);
            array.add(index+1, b);
        }

    }

    public static void printArr(int[] m){
        String print = "";
        for(int l = 0;l<m.length;l++){
            print += m[l]+" ";
        }
        System.out.println(print);
    }

}