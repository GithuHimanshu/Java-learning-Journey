public class SystemOutPrintF {
    public static void main(String[] args) {
        String name = "Himanshu";
        int age = 25;
        int salary = 40000;
        boolean developer = true;
        double percentage = 22.5;
        int marks = 75;
        // System.out.printf("My Name is : %s and My Age is : %f", name, percentage);

        // System.out.printf("Name : %s\n Marks : %d \n Percentage : %f ", name, marks,
        // percentage);
        System.out.printf("Name : %s\n Age : %d \n Salary : %d \n Developer : %b \n Marks : %d \n Percentage : %f ",
                name, age, salary, developer, marks, percentage);
        double price = 99.98765;
        System.out.printf("Price : %.2f ", price);
        int num = 42;
        System.out.printf("Number : %05d", num);

    }
}
