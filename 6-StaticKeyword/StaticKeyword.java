class Mobile {
    String brand;
    int price;
    static String category; // static variable of class mobile

    // STATIC BLOCK - used to initialise the static variables, when a program
    // executes, first class gets loaded and then objects are loaded, hence static
    // method executes first, even before the constructor of the class
    static {
        category = "Digital Devices";
        System.out.println("Static method called!");
    }

    // CONSTRUCTOR OF CLASS - used to initialise the objects of class when an object
    // gets instantiated (or gets created)
    Mobile() {
        brand = "";
        price = 200;
        System.out.println("Constructor called!");
    }

    public void show() { // normal method
        System.out.println(brand + " : " + price + " : " + category);
    }

    // STATIC METHOD - can only access/use the variables of class who are STATIC
    public static void show1() {
        System.out.println("category: " + category);
    }

    // in order to access non-static class variables, we have to pass and accept the
    // object of class in the function calling and declaration
    public static void show2(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + category); // here it can access non-static variables
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        // static keyword means you're making something as a Class' member not an
        // Object's member, made common in the heap memory
        // meaning it will be same/common for all the class objects and
        // we can use static variables using their class name

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 156;
        Mobile.category = "SmartPhone";

        obj1.show(); // Apple : 156 : SmartPhone

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 190;
        Mobile.category = "CellularPhone"; // first category was Smartphone, not it got overwritten here

        obj2.show(); // Samsung : 190 : CellularPhone

        // STATIC METHOD CALLING
        Mobile.show1(); // category: CellularPhone

        // passing class obj to static member in order to give it access to non-static
        // variables
        Mobile.show2(obj1); // Apple : 156 : CellularPhone
    }
}

// NOTE: "main" method in java class is always static so that JVM can invoke it
// without creating an object of it's class, not created static then first we
// have to make an object of its class, then only we will be able to access it
// but here's a catch, main method is the first thing that jvm needs in order to
// start program, this will create a deadlock situation, hence creating MAIN
// method static is a important.

/*
 * Output of this file:
 * 
 * Static method called!
 * Constructor called!
 * Apple : 156 : SmartPhone
 * Constructor called!
 * Samsung : 190 : CellularPhone
 * category: CellularPhone
 * Apple : 156 : CellularPhone
 * 
 */