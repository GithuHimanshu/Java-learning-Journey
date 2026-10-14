package multithreading.thread_basics;

public class ThreadBasic {
    public static void main(String[] args) {
        System.out.println("< thread start >");
        System.out.println("< print thread name > " + Thread.currentThread().getName());

        System.out.println("< thread end >");

    }
}
