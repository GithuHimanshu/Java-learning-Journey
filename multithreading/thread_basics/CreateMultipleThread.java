package multithreading.thread_basics;

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

public class CreateMultipleThread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("thread 1");
        thread1.start();

        MyThread thread2 = new MyThread("thread 2");
        thread2.start();

        MyThread thread3 = new MyThread("thread 2");
        thread3.start();

    }
}
