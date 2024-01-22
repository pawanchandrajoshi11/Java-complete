
/*
 * The throws keyword indicates what exception type may be thrown by a method.

There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc
 */
public class Throws {
    public static void main(String[] args) {
        try {
            B();
        } catch (Exception e) {
            System.out.println("Exception found somewhere");
        }
    }
}

class B throws Exception
{
        C();
        D();
    }

    class C throws Exception
    {
            int i = 0;
            int j = 10 / i;
        }

class D throws Exception{
    int a = 10;
}
