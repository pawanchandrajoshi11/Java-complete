/*
 * ERRORS: 3 types
 * 1. Compile time errors
 * 2. Run time errors - these errors are called exceptions
 * 3. Logical Errors
 */

// public class Exceptions {
//     public static void main(String[] args) {

//         int i = 10;
//         int j = 0;

//         try{
//             j = 20/i;
//         }
//         catch (Exception e) {
//             System.out.println("There is an error...");
//         }

//         System.out.println(j);
//         System.out.println("End");
//     }
// }

// MULTIPLE CATCH BLOCKS

public class Exceptions {
    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int arr[] = new int[5];

        try {
            j = 20 / i;
            j = arr[3];
            System.out.println(arr[6]); // error
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index not found");
        } catch (Exception e) {
            System.out.println("Error Occurred!");
        }

        System.out.println(j);
        System.out.println("End");
    }
}


// HIERARCHY OF EXCEPTIONS
/*
 * OBJECT -> Throwable ->   Error -> which we cannot resolve, could be threaddeath, IO Error, virtual machine error -out of memory
 *                          Exceptions ->   RunTime Exceptions (unchecked exception - compiler just warns you) -> Arithmetic, arrayindexoutofboundsexception, nullpointer, etc.
 *                                          SQL exceptions (checked exception - compiler forces you to solve this exception during compile time)
 *                                          IO exceptions (checked exception) 
 */