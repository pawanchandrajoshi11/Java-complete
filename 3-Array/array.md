# ARRAY

```java
public class Arrays {
    public static void main(String[] args) {
        // int num[] = {5,6,7}

        // array creation with size
        int nums[] = new int[5];
        nums[0] = 4;
        nums[1] = 9;
        nums[2] = 3;
        nums[3] = 12;
        nums[4] = 7;

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i]); // 4,9,3,12,7
        }

        // MULTI-DIMENTIONAL ARRAY - arrays inside array
        int arr[][] = new int[3][2]; // right now, all elements are zero
        // 0 0
        // 0 0
        // 0 0 3X2 matrix

        // ENHANCED FOR LOOP
        for (int n[] : arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // JAGGED ARRAY
        int arr1[][] = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[5];
        arr1[2] = new int[4];

        // [
        //     arr1[0] -> [0,0,0],
        //     arr1[1] -> [0,0,0,0,0],
        //     arr1[2] -> [0,0,0,0]
        // ]

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 10);
                System.out.print(arr1[i][j]);

            }
            System.out.println();
        }

        // 3 - DIMENTIONAL ARRAYS
        int a[][][] = new int[3][4][5];
    }
}
```
