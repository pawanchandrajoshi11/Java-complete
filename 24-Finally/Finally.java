
// FINALLY block will run irrespective of exceptions, it is generally used to close the opened resource (file, network connection, database connection, input resource, etc)
// it is going to execute the statements regardless there is an exception or not.

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        // int i = 0;
        // int j = 0;

        // try{
        // j = 18/i;
        // }
        // finally {
        // System.out.println("End!");
        // }

        // EXAMPLE

        // Scanner st = null;
        // try{
        //     st = new Scanner(System.in);
        //     int num = st.nextInt();
        //     System.out.println("HEllo");
        // }
        // finally {
        //     st.close();
        // }


        // JAVA also has a newer way to close opened resources without using finally block

        try (Scanner st = new Scanner(System.in)) {
            int num = st.nextInt();
            System.out.println("HELLO");
        } // after the try block gets executed, stream (st) will automatically be closed
    }
}
