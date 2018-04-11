package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BiggestOfFive {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double first = Double.parseDouble(reader.readLine());
        double second = Double.parseDouble(reader.readLine());
        double third = Double.parseDouble(reader.readLine());
        double fourth = Double.parseDouble(reader.readLine());
        double fifth = Double.parseDouble(reader.readLine());

        double biggest = Math.max(first, second);
        biggest = Math.max(biggest, third);
        biggest = Math.max(biggest, fourth);
        biggest = Math.max(biggest, fifth);
        if(biggest==(int)biggest){
            System.out.println((int)biggest);
        }
        else System.out.println(biggest);
    }
}