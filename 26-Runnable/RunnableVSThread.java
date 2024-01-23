// IN ORDER TO MAKE THREAD, we can either extend thread class or we can implement an interface runnable but runnable doesn't have thread methods so we have to create thread objects first and then we can use the features

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("IN A");
    }
}

// class B implements Runnable {
// public void run() {
// for (int i = 0; i < 5; i++)
// System.out.println("IN B");
// }
// }

public class RunnableVSThread {
    public static void main(String[] args) {

        Runnable obj1 = new A(); // creating references of classes

        Runnable obj2 = () -> {     // we can also make threads like this, using lamda expression, no need to define class additionally
            for (int i = 0; i < 5; i++)
                System.out.println("IN B");
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
