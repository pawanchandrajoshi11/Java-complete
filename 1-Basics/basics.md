
# BASICS OF JAVA

```java
public class hello {
    public static void main(String arg[]) {

        // VARIABLE AND DATA TYPES

        int num = 129;
        float ff = 12.6f;
        byte by = 127; // 127 is the last value of byte, >127 will give error
        short sh = 559;
        long l = 12312l;
        double dbl = 123.23423;
        char ch = 'p'; // we can put double quotes here as it will treat it as a string and give error
        boolean b = true;
        // boolean in java uses only TRUE & FALSE
        System.out.println("Hello World");

```

<h3>LITERALS</h3>

```java
        float num1 = 10_00_00_000; // 100000000
        int decimalnum = 0b101; // 5
        int hexadecimalnum = 0x7E; // 126
        double d = 56; // 56.0

        char c = 'a'; // a
        c++;
        System.out.println(c); // b

```

<h3> TYPE CONVERSION AND CASTING </h3>

```java
        byte byt = 127;
        int a = 12;
        int temp = 15;
        // by = c; error
        byt = (byte) temp; // explicit CASTING, 257 % 256 = 1
        // a = b; // this will work, implicit conversion, a will become 127
```

<h3> ASSIGNMENT OPERATOR </h3>

- assigns a value of variable 1 into variable 2 and could
- perform many kind of operations such as pre/post-increament,
- multiplication/division/addition/subtraction/modulo etc

<h3> RELATIONAL OPERATOR </h3> 

> ==, <, >, >=, <=, != (not equal to)

- LOGICAL OPERATOR -> && (and), || (or), !(not)
- CONDITIONAL STATEMENTS -> if, else, if else, if else if
- TERNARY OPERATOR -> ?: , eg: ans = n%2==0? "even": "odd";

<h3>SWITCH STATEMENT</h3>

```java
        int n = 1;
        // old way of using switch
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Number");
        }

        // new way of using switch
        // String str = "monday";
        // switch (str) {
        // case "monday", "tuesday" -> System.out.println("6am");
        // case "wednesday" -> System.out.println("7am");
        // default -> System.out.println("Holiday");
        // }

        // we can also return a value from switch now
        String str = "monday";
        String result = "";
        result = switch (str) {
            case "monday", "tuesday" -> "6am";
            case "wednesday" -> "7am";
            default -> "Holiday";
        };

//hence switch can be an expression and could be a statement

// LOOPS -> while, do while, for

// OBJECT ORIENTED PROGRAMMING
// OBJECT - properties and behaviours
// CLASS

    }
}
```
