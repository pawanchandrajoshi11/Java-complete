// DYNAMIC METHOD DISPATCH
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

class D {
    public void show() {
        System.out.println("In A show");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // In A show

        // this is called dynamic method dispatch, here we don't know which method is
        // going to run, it will be decided on the run-time itself, hence it is dynamic

        obj = new B();
        obj.show(); // In B show

        // obj = new D(); // error since D is not performing inheritance

    }
}