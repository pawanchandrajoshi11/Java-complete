// ENCAPSULATION - binding data and method together such that direct access to the data by an object gets restricted

class Human {
    private int age;
    private String name;

    // Following methods are called GETTERS AND SETTERS
    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        // this keyword - represents the current object, this.name here represents the
        // "name" of class Human
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 12; // this will give error, since data members are private
        obj.setAge(13);
        obj.setName("Pawan");

        System.out.println(obj.getName() + " : " + obj.getAge()); // Pawan : 13
    }
}
