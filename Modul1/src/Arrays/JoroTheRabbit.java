package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JoroTheRabbit {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(", ");
        int max = str.length;
        int[] array = new int[max];
        for(int i = 0;i<max;i++){
            array[i] = Integer.parseInt(str[i]);
        }

        int bestLength = 0;
        int nextPosition;
        int position;
        int currentLength;
        boolean isMax = false;
        for(int startPosition = 0; startPosition<max;startPosition++){
            for(int step =1;step< max;step++){
                boolean[] used = new boolean[max];
                position = startPosition;
                currentLength = 0;
                while(!used[position]){
                    used[position] = true;
                    currentLength++;
                    nextPosition = (position+step)%array.length;
                    if(array[nextPosition]<=array[position]){
                        break;
                    }
                    position=nextPosition;

                }


              if (currentLength>bestLength){
                    bestLength = currentLength;
              }
                if(bestLength==max || bestLength == (max-1)){
                    break;
                }
            }

            if(bestLength==max ){
                break;
            }
        }
        System.out.println(bestLength);


    }

}
