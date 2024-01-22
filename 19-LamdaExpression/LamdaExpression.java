
@FunctionalInterface // interface having only one method
interface A {
    void show();
}

public class LamdaExpression {
    public static void main(String args[]) {
        A obj = () -> {     // Lamda Expression - introduced in java 8 - only works with a functional interface(interface having only one method)
            System.out.println("In show method");
        };

        obj.show();


        // what if we want to except a variable
        // interface A {
        //     void show(int i);
        // }
        // A obj = (int i) -> System.out.println("In show method " + i);


        // in case we want to return something 
        // interface A {
        //     int add(int a, int b);
        // }
        // A obj = (int i, int j) -> i + j;     // this is the return statement, can also be coded as: A obj = (i, j) -> i+j;
    }
}


/*
 * Interafaces are of three types
 * 1. Normal interface - interface having more than two methods
 * 2. SAM/Functional Interface - interface having only one method
 * 3. Marker Interface - interface having no method
 */