package multithreading.thread_basics;

/**
 * MyThread e
 */
class MyThread extends Thread {
    // set thread name use this
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("<running thread> " + Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }

}

public class SetThreadName {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        thread1.start();
    }
}
