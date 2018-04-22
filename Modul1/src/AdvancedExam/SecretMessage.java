package AdvancedExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretMessage {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String code = reader.readLine();
    String encodedText = "";

}

public static void encodeMessage(String decoded, int startIndex, String encodedText, int times){


        if(Character.isDigit(decoded.charAt(startIndex))){
            times = decoded.charAt(startIndex)-'0';
            String rest = decoded.substring(startIndex+2,decoded.length()-1);
            encodeMessage(rest,0, encodedText,times);
        }
        if(Character.isLetter(decoded.charAt(startIndex))){
        char ch = decoded.charAt(startIndex);
        for(int i = 0;i<times;i++){
            encodedText+=ch;
        }
        }
}


}
