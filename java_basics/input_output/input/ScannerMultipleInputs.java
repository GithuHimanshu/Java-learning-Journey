import java.util.Scanner;

public class ScannerMultipleInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        System.out.println("Enter Your Salary");
        double salary = sc.nextDouble();
        System.out.printf("Salary    : %.2f%n", salary);
        // System.out.println("Enter Your Name");
        // String name = sc.next();
        // System.out.println("Enter Your Age");
        // int age = sc.nextInt();
        // System.out.println("Enter Your marks");
        // double marks = sc.nextDouble();
        // float salary = sc.nextFloat();
        // long bigNum = sc.nextLong();
        // boolean flag = sc.nextBoolean();
        // char ch = sc.next().charAt(0);
        // System.out.println("My Name is : " + name);
        sc.close();
    }
}
