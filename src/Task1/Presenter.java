package Task1;

import java.util.Scanner;

public class Presenter {
    Model m1 = new Model();
    View v1 = new View();

    Scanner scan = new Scanner(System.in);
    public void start() {
        String opearotr = v1.getOper();
        switch (opearotr) {
            case "+":
                m1.addition(v1.getDouble1(), v1.getDouble2());
                break;
            case "-":
                m1.substraction(v1.getDouble1(), v1.getDouble2());
                break;
            case "*":
                m1.multiplication(v1.getDouble1(), v1.getDouble2());
                break;
            case "/":
                m1.division(v1.getDouble1(), v1.getDouble2());
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
}
