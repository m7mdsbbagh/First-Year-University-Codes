public class Calculator
{
    public Calculator()
    {}

    double add(double num1, double num2)
    {
        return num1 + num2;
    }

    double sub(double num1, double num2)
    {
        return num1 - num2;
    }

    double mul(double num1, double num2)
    {
        return num1 * num2;
    }

    double div(double num1, double num2)
    {
        if (num2 == 0)
        {
            System.out.println("\nError!\nCannot divide by zero!");
            return Double.NaN;
        }

        return num1 / num2;
    }
}
