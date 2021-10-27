import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans;
        System.out.println("Do you want to perform a calculation?");
        String Ans = sc.nextLine();
        boolean yes = true;
        while (yes) {
            System.out.print("\nEnter first number:");
            double num1 = sc.nextDouble();
            System.out.print("\nEnter an operator(+,-,*,/,c,s,d)");
            char op = sc.next().charAt(0);
            System.out.print("\nEnter second number:");
            double num2 = sc.nextDouble();

            switch (op) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                case 'c':
                    ans = Math.cos(num1 / num2);
                    break;
                case 's':
                    ans = Math.sin(num1 / num2);
                    break;
                case 'd':
                    ans = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Error");
                    return;
            }
            System.out.print("\nThe result is given as follows:\n");
            System.out.print(num1 + " " + op + " " + num2 + "=" + ans);
        }
    }
}

