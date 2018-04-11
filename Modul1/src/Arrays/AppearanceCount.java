package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class AppearanceCount {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int X = Integer.parseInt(scan.nextLine());
        int times = 0;
        for(int i =0;i<array.length;i++){
            if(array[i]!=X){
                continue;
            }
            times++;
        }
        System.out.println(times);
    }


}