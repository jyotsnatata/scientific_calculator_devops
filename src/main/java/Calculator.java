import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("SCIENTIFIC CALCULATOR USING DEVOPS");

        do {
            System.out.println("Enter operation to perform:\n1.Square Root\n2.Factorial\n3.Natural Logarithm\n4.Power\n\nPress any other key to EXIT");
            choice = scanner.nextInt();

            double result;
            switch(choice) {
                case 1:
                    System.out.println("Enter a number: ");
                    Scanner scan = new Scanner(System.in);
                    double num = scan.nextDouble();
                    result = Math.sqrt(num);
                    System.out.println("Square Root of " + num + "is = " + result);
                    break;
                case 2:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter a number: ");
                    int num1 = scanner1.nextInt();
                    result = calculator.factorial(num1);
                    System.out.println(num1+"!"+" = " + result);
                    break;
                case 3:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter a number: ");
                    double num2 = scanner2.nextDouble();
                    result = Math.log(num2);
                    System.out.println("Natural Logarithm of " + num2 + "is = " + result);
                    break;
                case 4:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Enter base: ");
                    double base = scanner3.nextDouble();
                    System.out.println("Enter exponent: ");
                    double exp = scanner3.nextDouble();
                    result = Math.pow(base,exp);
                    System.out.println("Power = " + result);
                    break;
                default:
                    System.out.println("Exiting...");
            }
        }
        while(true);
    }

    public int factorial(int num) {
        if(num == 0) return 1;
        return num*factorial(num-1);
    }

}
