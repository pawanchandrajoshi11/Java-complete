
public class WrapperClass {
    public static void main(String[] args) {

        // WRAPPER CLASS - it is a class which wraps around primitive datatypes and
        // converts it into objects
        // it provides a way to treat primitive datatype such as int, double, string as
        // objects, this allows use of primitive data types in places where only objects
        // are accepted, such as in collections
        int num = 10;
        Integer n1 = num; // autoboxing

        int n2 = n1; // auto-unboxing
        System.out.println(n2); // 10

        String str = "123";
        int n3 = Integer.parseInt(str);
        System.out.println(n3 * 2); // 246
    }
}
