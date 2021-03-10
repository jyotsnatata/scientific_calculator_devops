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
                    result = calculator.squareRoot();
                    System.out.println("Square Root = " + result);
                    break;
                case 2:
                    System.out.println("Enter a number: ");
                    int num = scanner.nextInt();
                    result = calculator.factorial(num);
                    System.out.println("Factorial = " + result);
                    break;
                case 3:
                    result = calculator.logarithm();
                    System.out.println("Natural Logarithm = " + result);
                    break;
                case 4:
                    result = calculator.power();
                    System.out.println("Power = " + result);
                    break;
                default:
                    System.out.println("Exiting...");
            }
        }
        while(true);
    }

    public double squareRoot(){
        double num, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scan.nextDouble();
        result = Math.sqrt(num);
        return result;
    }

    public int factorial(int num) {
        if(num == 0) return 1;
        return num*factorial(num-1);
    }

    public double logarithm() {
        double num, result;
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextDouble();
        result = Math.log(num);
        return result;
    }

    public double power() {
        double base,exp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base number: ");
        base = scan.nextDouble();
        System.out.println("Enter exponent number: ");
        exp = scan.nextDouble();
        return Math.pow(base,exp);
    }

}
