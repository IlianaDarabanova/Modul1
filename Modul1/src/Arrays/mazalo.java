package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class mazalo {

    public static void main(String[] args) {
        String str = "**+";
      for(int i = 0;i<str.length();i++){
          char currentChar = str.charAt(i);
          switch (currentChar){
              case '*' :
                  System.out.println("*");
                  break;

              case '+' :
                  System.out.println("+");
                      break;

          }
      }
    }
}
