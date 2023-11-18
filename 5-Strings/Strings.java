public class Strings {
    public static void main(String[] args) {
        // String in Java is a class in itself. It is a primitive class
        String name = "Pawan";
        String lastName = new String("Joshi"); // this is also correct
        System.out.println("Hey " + name + lastName); // Hey Pawan Joshi

        // MUTABLE - COULD CHANGE
        // IMMUTABLE - COULD NOT CHANGE
        // BY DEFAULT STRING IN JAVA IS IMMUTABLE - ONCE CREATED CANNOT BE MODIFIED
        // FURTHER

        // IN ORDER TO MUTATE (MODIFY) STRING IN JAVA, we have two classes, STRING
        // BUILDER AND STRING BUFFER
        // STRING BUFFER is thread safe and STRING BUILDER is not.

        StringBuffer sb = new StringBuffer("Pawan Chandra");
        sb.append(" Joshi");

        // storing stringBuffer in String variable
        String str = sb.toString();
        System.out.println(str); // Pawan Chandra Joshi

        sb.insert(0, "Inserted_value ");
        sb.insert(15, "2");
        System.out.println(sb); // Inserted_value 2Pawan Chandra Joshi
    }
}
