package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Indices {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        int[] numbers =new int[str.length];
        for(int i = 0;i<str.length;i++){
            numbers[i] = Integer.parseInt(str[i]);
        }



        printSequence(numbers,0);
    }

    public static void printSequence(int[] array, int index){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String str = "";
        boolean hasLoop = false;
        HashSet<Integer> indices = new HashSet<Integer>();
        int nextIndex = 0;
        int startNumber = Integer.MIN_VALUE;
        while(nextIndex<array.length && nextIndex>-1){
            if(indices.contains(nextIndex)){
                hasLoop = true;
                startNumber = nextIndex;
                str = str.trim();
                if(str.length()==1 || nextIndex ==0){
                    str = "("+str+")";
                }
                else{
                    str = "";
                    for(int i = 0 ; i <nums.size();i++){
                        if(nums.get(i)==startNumber){
                            str+="(";
                        }
                        else{
                            str+=" ";
                        }
                        if(i == nums.size()-1){
                            str +=nums.get(nums.size()-1)+ ")";
                            break;
                        }
                        str += nums.get(i);

                    }
                    //str = str+")";


                }
                break;
            }
            nums.add(nextIndex);
            str+=nextIndex+" ";
            index = nextIndex;
            indices.add(index);
            nextIndex = array[index];


        }
        System.out.println(str.trim());
    }
}