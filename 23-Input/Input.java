// Previously BufferedReader was used to take input
// Now Scanner class is being used

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a number");


        // METHOD - 1
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());


        // METHOD - 2

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);

        // bf.close();  after using the bufferedReader, we've to close the opened file/network/database
    }
}
