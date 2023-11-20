abstract class Car {
    public abstract void drive();

    public void music() {
        System.out.println("Playing music...");
    }
}

// ABSTRACT CLASS - class which has an abstract method in it.
// ABSTRACT METHOD - method which doesn't have any implementation inside the
// class, it has only declaration.
// abstract method can only be made inside an abstract class.
// Object of abstract class cannot be created, but it's clild class can have an
// object.
// child class inheriting abstract class, must provide a definition of the
// inherited abstract method.

// NOTE: suppose class Car have more than one abstract methods but in the Child
// class ie. Swift, if the definition is not provided of all those abstract
// method, then this child class will become an abstract class, then we have to
// make another class which will inherit these abstract class and there also we
// have to provide the definition of all the above abstracted methods.

class Swift extends Car {
    public void drive() {
        System.out.println("Driving Car...");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Swift obj = new Swift();
        obj.drive(); // Driving Car...
    }
}
