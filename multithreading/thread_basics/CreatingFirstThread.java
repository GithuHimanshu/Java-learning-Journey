package multithreading.thread_basics;

class MyThread extends Thread {
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

public class CreatingFirstThread {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
    }

}
