class PawanException extends Exception{ // inherting parent class
    PawanException(String str) {    // parent class has a method which takes string and prints it.
        super(str);
    }
}

public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            System.out.println(j);
            if (j == 0) {
                throw new ArithmeticException("Hello"); // throw keyword is used to throw an exception
            }
            /*
             * throw is useful when there is no exception in the code yet we want to execute stuff inside catch block
             */
            if (j == 5) {
                throw new PawanException("This is a custom exception ");    // custom exception
            }
        }
        catch (PawanException e) {
            System.out.println("Custom exception!" + e);
        }
        catch (Exception e) {
            System.out.println("That's a default exception" + e);
        }

        System.out.println("END!");
    }
}
