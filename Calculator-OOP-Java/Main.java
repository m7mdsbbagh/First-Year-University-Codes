import java.util.*;



public class Main {

    static Scanner in = new Scanner(System.in);

    public static double readNum(String message)
    {

        System.out.print(message);

        return in.nextDouble();
    }

    public static char readChar(String message)
    {
        System.out.print(message);
        return in.next().charAt(0);
    }

    public static double calculate(Calculator c, double num1, char op, double num2)
    {
        switch (op)
        {
            case '+':
                return c.add(num1, num2);
            case '-':
                return c.sub(num1, num2);
            case '*':
                return c.mul(num1, num2);
            case '/':
                return c.div(num1, num2);
            default:
                System.out.println("\nInvalid operator!");
                return Double.NaN;
        }
    }

    public static void main(String[] args)
    {
        Calculator calcObj1 = new Calculator();

        double num1 = readNum("Enter first number: ");
        char op = readChar("Enter operator (+ - * /): ");
        double num2 = readNum("Enter second number: ");

        double result = calculate(calcObj1, num1, op, num2);

        if (!Double.isNaN(result))
            System.out.println("\nResult = " + result);
    }
}
