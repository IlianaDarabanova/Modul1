package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class AboveTheMainDiagonal {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        BigInteger result = BigInteger.ZERO;

        ArrayList<ArrayList<Long>> mainList = new ArrayList<>();
        long m = 1;
        for (int i = 0; i < N; i++) {

            ArrayList<Long> intList = new ArrayList<>();
            int counter = N;
            long k = m;
            while(counter>0) {

                intList.add(k);
                k *=2;
                counter--;
            }
            mainList.add(intList);
            m *=2;
        }
//        System.out.println(mainList.size());
//        System.out.println(mainList.get(0).size());
        for (int row = 0; row < mainList.size()-1; row++) {
            for (int col = mainList.get(row).size()-1; col > row; col--) {
                result = result.add(BigInteger.valueOf(mainList.get(row).get(col)));
            }

        }
        System.out.println(result);



    }

}