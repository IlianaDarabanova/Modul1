package Recursion;

import java.util.Scanner;

public class reverse_string {
    public static String reverseMe(String str){
        if (str.length()==0){
            return str;
        }
        var rest = str.substring(1);
        return reverseMe(rest)+str.charAt(0);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        var str = scan.nextLine();
        var name = "Telerik";
        var reversed = reverseMe(str);
        System.out.print(reversed);
    }
}
