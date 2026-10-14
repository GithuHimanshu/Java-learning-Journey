package multithreading.thread_basics;

class MyThread implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 6; i++) {
            System.out.println("<running thread> " + Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }

}

public class ThreadVsRunnable {
    public static void main(String[] args) {
        // create objact thread and first way
        MyThread t1 = new MyThread();
        Thread task1 = new Thread(t1);
        task1.start();
        // with thread name
        MyThread t2 = new MyThread();
        Thread task2 = new Thread(t2, "task2");
        task2.start();
        // another way to create objact with Thread name

        Thread task3 = new Thread(new MyThread(), "task3");
        task3.start();
    }

}
