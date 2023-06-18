package Task1;

public class Model implements I_Addition, I_Substraction, I_Division, I_Multiplication {

    @Override
    public void addition(double number1, double number2) {
        double result = number1 + number2;
        System.out.println(number1 + "+" + number2 +"=" +result);
    }

    @Override
    public void division(double number1, double number2) {
        double result = number1 / number2;
        if (number2 != 0) {
            System.out.println(number1 + "/" + number2 + "=" + result);
        } else {
            throw new ArithmeticException("Деление на ноль не допускается.");
        }
    }

    @Override
    public void multiplication(double number1, double number2) {
        double result = number1 * number2;
        System.out.println(number1 + "*" + number2 +"=" +result);

    }

    @Override
    public void substraction(double number1, double number2) {
        double result = number1 - number2;
        System.out.println(number1 + "-" + number2 +"=" +result);

    }
}
