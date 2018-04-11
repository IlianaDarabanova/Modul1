package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThreeGroups {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbersStr = reader.readLine().split(" ");
        int[] numbers = new int[numbersStr.length];

        ArrayList<Integer> zero = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        for(int i =0;i<numbersStr.length;i++){
            numbers[i] = Integer.parseInt(numbersStr[i]);
            if (numbers[i]%3==0){
                zero.add(numbers[i]);
            }
            else if(numbers[i]%3==1){
                one.add(numbers[i]);
            }
            else if(numbers[i]%3==2){
                two.add(numbers[i]);
            }

        }

        print(zero);
        print(one);
        print(two);

    }
    public static void print(ArrayList<Integer> array){
        String print ="";
        for(int i = 0;i<array.size();i++){
            print+=array.get(i)+" ";
        }
        System.out.println(print);
    }

}