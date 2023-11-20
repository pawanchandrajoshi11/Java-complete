class A {
    public void show() {
        System.out.println("In A show");
    }
}

// example of ABSTRACT CLASS AND ANONYMOUS CLASS
abstract class B {
    public abstract void display();

    public abstract void running();
}

class AnonymousInnerClass {
    public static void main(String[] args) {
        // Inner Anonymous class - will be used only once while creating, for one timer
        // only
        A obj = new A() {
            public void show() {
                System.out.println("Inside inner anonymous class");
            }
        };

        obj.show(); // Inside inner anonymous class

        // ABSTRACT CLASS eg.
        // B obj2 = new B(); this will give error as class B is an abstract class
        // so what we can do is make an Anonymous class
        // this will work even we have more than one abstract method inside our abstract
        // class
        B obj2 = new B() {
            public void display() {
                System.out.println("In display");
            }

            // second abstract method definition
            public void running() {
                System.out.println("Inside running");
            }
        };

        obj2.display(); // In display
        obj2.running(); // Inside running
    }
}