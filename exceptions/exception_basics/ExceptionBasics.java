package exceptions.exception_basics;

public class ExceptionBasics {
    public static void main(String[] args) {
        // System.out.println("< Program Start >");
        // System.out.println("Program 1>");
        // System.out.println("Program 2>");
        // System.out.println("Program 3>");
        // // Exception in thread "main" java.lang.ArithmeticException: / by zero dd
        // System.out.println("Program >" + (100 / 0));

        // System.out.println("Program 4>");
        // System.out.println("Program 5>");

        // System.out.println("< Program End >");
        try {
            System.out.println("< Program Start >");
            System.out.println("Program  1>");
            System.out.println("Program  2>");
            System.out.println("Program  3>");
            // Exception in thread "main" java.lang.ArithmeticException: / by zero dd
            System.out.println("Program  >" + (100 / 0));

            System.out.println("Program  4>");
            System.out.println("Program  5>");

            System.out.println("< Program End >");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}
