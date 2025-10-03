import java.util.Scanner;

public class LearnDebug{
    // Function for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero not allowed!");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("Hi i am here");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();
//        double num1 =1.44;
//        double num2 =2.44;
        System.out.println(add(num1,num2));
    }
}


