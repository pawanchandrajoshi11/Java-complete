
public class Final {

    // FINAL in java is same as CONST in C++, value once assigned cannot be changed

    // FINAL could be method, variable, class
    // FINAL variable - once value assigned to a variable it cannot be changed
    // FINAL class - once class is made final then it will not follow inheritance]
    // FINAL method - once method becomes final, method overridding stops working

    public static void main(String[] args) {
        final int c = 10;
        // c = 9; // this will give an error
        System.out.println(c);
    }
}
