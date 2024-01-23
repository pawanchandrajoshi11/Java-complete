//  The synchronized keyword ensures that only one thread can execute the increment method at a time. 
// This prevents multiple threads from concurrently modifying the count variable and causing a race condition.

class Counter {
    int count = 0;

    public synchronized void increment() { // using synchoronized keyword helps synchronizing the threads preventing
                                           // race condition (when two or more threads try to work on same process at same time)
        count++;
    }
}

public class SynchronizedThreads {
    public static void main(String[] args) throws InterruptedException {
        Counter obj = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                obj.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                obj.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // Wait for both threads to complete
        t1.join();
        t2.join();

        // When you print the value of obj.count after starting the threads, there is no
        // guarantee that the threads have completed their execution. Threads run
        // concurrently, and the System.out.println(obj.count) statement might execute
        // before the threads finish their work.

        // To ensure that the threads have completed their execution before printing the
        // result, you should use the 'Thread.join()'

        System.out.println(obj.count);
    }
}
