// INTERFACE - is not a class, every method inside interface is 'public abstract' by default
// interface is like a design template, and it's mandatory to define all the interface's methods, 
// otherwise the class which is implementing the interface becomes abstract
// and we cannot instantiate (create objects) interfaces
// in short "INTERFACE IS A BLUE-PRINT OF A CLASS" and a mechanism to achieve abstraction

// a class can implement multiple interfaces but same cannot be done with abstract classes, 
// a class can only inherit one abstract class

// INTERFACES CAN PERFORM INHERITANCE
interface X {
    void run();
}

interface Y extends X {

}

// things to remember:
// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface Computer {
    int mouse = 1; // variables inside interface are FINAL and STATIC by default
    String brand = "Apple";

    void show();
}

class Desktop implements Computer {
    public void show() {
        System.out.println("Code, Compile, Run - FASTER!");
    }
}

class Laptop implements Computer {
    public void show() {
        System.out.println("Code, Compile, Run");
    }
}

class Developer {
    public void work(Computer device) {
        device.show();
    }
}

public class Interface {
    public static void main(String[] args) {

        Computer laptop = new Laptop(); // Reference of interface Computer, since object creation is not possible
        Computer desktop = new Desktop();

        Developer person = new Developer();

        person.work(laptop);
        person.work(desktop);
    }
}
