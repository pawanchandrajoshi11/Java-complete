
// ACCESS MODIFIERS -  Access modifiers are keywords that can be used to control the visibility of fields, 
// methods, and constructors in a class. The four access modifiers in Java are:

// public, 
// protected, 
// default, 
// and private.

class A {

    private int number = 8123;
    protected int marks = 12; // can be access inside the same class but not in some other package, could be
                              // access inside other packages but there you've to inherit it first from its
                              // base class

    int age = 123; // this is default, cannot access it outside other package [dont use it lol]

    public void display() {
        System.out.println("Public method of class A");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        A obj = new A();
        // obj.number = 2; this will give error but method of A can access private
        // member number

    }
}
