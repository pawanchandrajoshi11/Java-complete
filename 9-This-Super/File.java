class A {
    public A() {
        super(); // but why super class in parent class A????
        // because EVERY CLASS IN JAVA EXTENDS CLASS "OBJECT", here it is like ->
        // class A extends Object
        System.out.println("In A");
    }

    public A(int n) {
        super();
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("In B");
    }

    public B(int n) {
        // super(4); // this will call the parameterised constructor of super class
        this(); // "this" method will call the constructor of the same class.
        System.out.println("In B int");
    }
}

// NOTE: in inheritance, calling child class' constructor will always invoke
// base(parent) class' constructor

// SUPER() - it is always present inside the constructor and it means calling
// the constructor of parent(super) class' constructor(default constructor).
// when

public class File {
    public static void main(String[] args) {
        B obj = new B();
        // output:
        // In A
        // In B

        B obj2 = new B(24);
        // output:
        // In A
        // In B int

        // "THIS" method eg.
        B obj3 = new B(5); // when only "this()" is present inplace of "super()" in parameterised
                           // constructor of class B
                           // output:
                           // In A
                           // In B
                           // In B int
    }
}

// CONCLUSION:
// this() method executes the constructor of same class
// super() method executes the constructor of super(parent) class

// NAMING CONVENTIONS - camel casing

// class and interface - (Capital) -> Calc, Runable
// variable and methods - num1, print()
// constant - (CAPITAL) -> DATA

// ANONYMOUS OBJECTS
// new A(); // will create a reference, works same as an object
// but we cannot use it again, (Its of no use except calling a function ONE
// time) -> new ClassName().show();