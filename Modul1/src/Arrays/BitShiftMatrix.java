package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BitShiftMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(reader.readLine());
        int C = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());
        int coeff = Math.max(R,C);
        String[] movesStr = reader.readLine().split(" ");
        ArrayList<Integer> moves = new ArrayList<Integer>();
        for(int i =0;i<movesStr.length;i++){
            moves.add(Integer.parseInt(movesStr[i]));
            System.out.println(moves.get(i));
        }

    }

    public static void goToTarget(){

    }

}
