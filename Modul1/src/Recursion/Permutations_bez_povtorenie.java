package Recursion;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Permutations_bez_povtorenie {
    public static void getAllPermutations(int index, int n, List<Integer> permutation, HashSet<Integer> used ){
        if(index==n){
            permutation.forEach(System.out::print);
            System.out.println();
            return;
        }

        for(int value = 1;value<=n;value++){
            if(used.contains(value)){
                continue;
            }

            used.add(value);
            permutation.set(index,value);

            getAllPermutations(index+1,n, permutation,used);
            used.remove(value);
        }


    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Integer> permutation = Stream.generate(()->0).limit(n).collect(Collectors.toList());
        getAllPermutations(0,n,permutation,new HashSet<Integer>());
    }
}
