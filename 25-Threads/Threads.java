// thread - A thread in Java is a lightweight process that can run concurrently with other threads.
//  Threads are managed by the Java Virtual Machine (JVM), and each thread has its own stack and program counter. This allows multiple threads to run independently of each other, and to share data with each other through shared variables or synchronization mechanisms.
// Threads are often used to improve the performance of Java applications by allowing multiple tasks to be executed simultaneously. For example, a web server may use multiple threads to handle multiple concurrent requests. Threads can also be used to implement parallelism, which is a technique for breaking down a large task into smaller tasks that can be executed simultaneously.

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("IN A");
    }
}

// to make a normal class thread like, class needs to inherit Thread class, and
// their needs to be a RUN() in it.
class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("IN B");


            try {
                Thread.sleep(2);    // this is in miliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 

        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();   // threads are called using START(), following which RUN() method inside thread class executes.
        obj2.start();

        
    }
}

// THREAD PRIORITY
// public class Threads {
// public static void main(String[] args) {
// A obj1 = new A();
// B obj2 = new B();

// obj1.getPriority(5);
// getPriority set a scale from 1 to 10, 1-> least priority, 5-> normal
// priority, 10-> maxPriority

// obj1.start();
// obj2.start();
// }
// }