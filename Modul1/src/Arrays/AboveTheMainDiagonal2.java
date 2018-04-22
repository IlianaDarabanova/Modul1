package Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class AboveTheMainDiagonal2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        BigInteger result = BigInteger.valueOf(0);
        for(int rows = 0; rows < N;rows++){
            for(int cols = rows;cols<N;cols++){
                result = result.add(BigInteger.TWO.pow(rows+cols));
            }
        }
        System.out.println(result);
    }
}
