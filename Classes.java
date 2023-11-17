//CLASSES AND OBJECTS

class Calculator {
    int a; // member object

    public int add(int n1, int n2) { // member function
        return (n1 + n2);
    }

    public void checking() {
        System.out.println("This is checking function of calculator");
    }
}

public class Classes {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        // Object of class calculator
        Calculator obj1 = new Calculator();
        int result = obj1.add(num1, num2);
        System.out.println("result = " + result); // 25

        obj1.checking();
    }
}

// JDK - java development kit
// JVM - java virtual machine
// JRE - java run-time environment

// JDK -> (JRE -> {JVM})

// METHOD OVERLOADING - multiple methods having same name but different
// functionalities
// in java, we can make many method of same name inside a same class and all
// methods work in different ways
/**
 * InnerClasses reprenting method overloading
 */
class InnerClasses {
    public int printVal(int a) {
        return a;
    }

    public int printVal(int a, int b) {
        return a * b;
    }
}