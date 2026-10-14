import java.util.Scanner;

public class ScannerStringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("My Name is : " + name);
        sc.close();
    }
}
