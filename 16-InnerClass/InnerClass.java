class Outer {

    public int val = 12;

    public void outerShow() {
        System.out.println("Inside outer show");
    }

    static class Inner {
        public void InnerShow() {
            System.out.println("Inside inner class!");
        }
    }
}

// INNER class should be made static then only its methods will be accessible in other classes

public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.outerShow(); // Inside outer show


        // this is how object of inner class is created
        Outer.Inner obj2 = new Outer.Inner();
        obj2.InnerShow(); // Inside inner class!
    }
}
