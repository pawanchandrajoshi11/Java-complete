class Student {
    int rollNum;
    String name;
    int marks;
}

public class ArrayObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNum = 1;
        s1.name = "Pawan";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollNum = 2;
        s2.name = "Kiran";
        s2.marks = 89;

        // Array of object (STUDENTS)
        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;

        // System.out.println("Name: " + students[0].name);
        // for (int i = 0; i < students.length; i++) {
        // System.out.println("Name: " + students[i].name); // Name: Pawan, Name: Kiran,

        // }

        // using Enhanced for loop
        for (Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        } // output: Pawan : 89 Kiran : 89
    }
}
