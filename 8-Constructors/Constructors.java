
class Human {
    private int age;
    private String name;

    // CONSTRUCTOR - special method of a class/structure in OOPS that initialises
    // the newly created object of that type
    // automatically gets invoked when object of class gets created.

    Human() { // DEFAULT CONSTRUCTOR
        age = 15;
        name = "Bambooos";
        System.out.println("Inside constructor!");
    }

    Human(int age, String name) { // PARAMETERISED CONSTRUCTOR
        this.age = age;
        this.name = name;
        System.out.println("Inside Parameterised constructor!");
    }
}

public class Constructors {
    public static void main(String[] args) {
        Human obj = new Human(); // invoke default constructor
        Human obj1 = new Human(18, "Pawan"); // invoke parameterised constructor
    }
}
