class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

// METHOD OVERRIDING - if subclass (child class) has the same method name as
// parent class (base class), it is called method overridding.
// This allows the subclass to inherit the methods and fields of the superclass
// while still being able to modify or extend the behavior of specific methods.

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // In B show
    }
}
