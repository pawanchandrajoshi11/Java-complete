import parentClasses.Calc;
import parentClasses.AdvCalc;
import parentClasses.VeryAdvCalc;
// import parentClasses.*;  // this will import all the FILES inside parentClasses package, not FOLDERS.

public class Inheritance {   
    public static void main(String[] args) {

        VeryAdvCalc obj = new VeryAdvCalc();

        int r1 = obj.add(5, 4);
        int r2 = obj.sub(12, 1);

        // single level inheritance
        int r3 = obj.multi(3, 5);
        int r4 = obj.div(50, 5);

        // multi-level inheritance
        int r5 = obj.power(2, 3);
        System.out.println(r1 + " , " + r2 + " , " + r3 + " , " + r4 + " , " + r5); // 9 , 11 , 15 , 10 , 8
    }
}