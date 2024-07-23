import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        double i = 9;   /*Counter declaration*/
        while(i<=55) /*Creation of a loop, it will stop when the number reaches the n 56*/{
            i++;
            if (((i % 2) != 0)&& /*Creation of an if structure with 3 conditions
                                       1. It will continue if the number isn't a pair*/
                    ((i % 3) != 0)&& /*2. It will continue if the number isn't a multiple of 3*/
                    (i != 16)) /*3. It will continue if the number isn't 16*/ {
                        System.out.println(i);
            }
        }


    }
}